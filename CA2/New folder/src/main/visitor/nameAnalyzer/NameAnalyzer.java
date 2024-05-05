package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.FloatValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.PatternItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;

import java.util.ArrayList;
public class NameAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    private void handleFunctionRedefinitistion (FunctionDeclaration functionDeclaration ,int duplicateFunctionId
            ,ArrayList<FunctionItem> functionItems ,FunctionItem funcItem){
        nameErrors.add(new RedefinitionOfFunction(functionDeclaration.getLine()
                ,functionDeclaration.getFunctionName().getName() ));
        String freshName = funcItem.getName() + "#" + String.valueOf(duplicateFunctionId);
        Identifier newId = functionDeclaration.getFunctionName();
        newId.setName(freshName);
        functionDeclaration.setFunctionName(newId);
        FunctionItem newItem = new FunctionItem(functionDeclaration);
        functionItems.add(newItem);
        try {
            SymbolTable.root.put(newItem);
        } catch (ItemAlreadyExists ignored) {
        }
    }

    private ArrayList<FunctionItem> addFunctionDeclarations (Program program){
        ArrayList<FunctionItem> functionItems = new ArrayList<>() ;
        int duplicateFunctionId = 0;

        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem funcItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(funcItem);
                functionItems.add(funcItem);
            } catch (ItemAlreadyExists e){
                duplicateFunctionId += 1;
                handleFunctionRedefinitistion(functionDeclaration ,duplicateFunctionId ,functionItems ,funcItem );
            }
        }

        return functionItems ;
    }

    private void visitFunctions (Program program ,ArrayList<FunctionItem> functionItems ){
        int visitingFunctionIndex = 0;
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = functionItems.get(visitingFunctionIndex);
            SymbolTable functionSymbolTable = new SymbolTable();
            functionItem.setFunctionSymbolTable(functionSymbolTable);
            SymbolTable.push(functionSymbolTable);
            functionDeclaration.accept(this);
            SymbolTable.pop();
            visitingFunctionIndex += 1;
        }
    }

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();

        //TODO: addFunctions,
        //Code handles duplicate function declarations by renaming and adding them to the symbol table.
        ArrayList<FunctionItem> functionItems = addFunctionDeclarations(program);

        //addPatterns
        int duplicatePatternId = 0;
        ArrayList<PatternItem> patternItems = new ArrayList<>();
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try {
                SymbolTable.root.put(patternItem);
                patternItems.add(patternItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfPattern(patternDeclaration.getLine(),
                        patternDeclaration.getPatternName().getName()));
                duplicatePatternId += 1;
                String freshName = patternItem.getName() + "#" + String.valueOf(duplicatePatternId);
                Identifier newId = patternDeclaration.getPatternName();
                newId.setName(freshName);
                patternDeclaration.setPatternName(newId);
                PatternItem newItem = new PatternItem(patternDeclaration);
                patternItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }
        //TODO:visitFunctions
        //Iterates over function declarations, assigns symbol tables, visits declarations, and manages symbol table stack.
        visitFunctions(program ,functionItems );

        //visitPatterns
        int visitingPatternIndex = 0;
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = patternItems.get(visitingPatternIndex);
            SymbolTable patternSymbolTable = new SymbolTable();
            patternItem.setPatternSymbolTable(patternSymbolTable);
            SymbolTable.push(patternSymbolTable);
            patternDeclaration.accept(this);
            SymbolTable.pop();
            visitingPatternIndex += 1;
        }
        //visitMain
        program.getMain().accept(this);
        return null;
    }

    private void checkFunctionArgs (FunctionDeclaration functionDeclaration){
        for (VarDeclaration variableDeclaration : functionDeclaration.getArgs()) {
            VarItem variableItem = new VarItem(variableDeclaration.getName());
            if(variableItem.getName().equals(functionDeclaration.getFunctionName().getName())){
                nameErrors.add(new IdenticalArgFunctionName(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName()));
            }
            variableDeclaration.accept(this);
        }
    }

    private void visitFunctionBody(FunctionDeclaration functionDeclaration){
        for (Statement stmt : functionDeclaration.getBody()) {
            stmt.accept(this);
        }
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        checkFunctionArgs(functionDeclaration);
        visitFunctionBody(functionDeclaration);
        return null;
    }

    @Override
    public Void visit(PatternDeclaration patternDeclaration){
        // Should add validation
        VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExists e) {}
        if(patternDeclaration.getTargetVariable().getName().equals(patternDeclaration.getPatternName().getName())){
            nameErrors.add(new IdenticalArgPatternName(patternDeclaration.getLine(),
                    patternDeclaration.getPatternName().getName()));
        }
        for(Expression cond : patternDeclaration.getConditions()) {
            cond.accept(this);
        }
        for(Expression returnExp : patternDeclaration.getReturnExp()) {
            returnExp.accept(this);
        }
        return null;
    }

    //TODO:visit all other AST nodes and find name errors



}