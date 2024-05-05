package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
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

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        VarItem variableItem = new VarItem(varDeclaration.getName());
        try {
            SymbolTable.top.put(variableItem);
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new DuplicateArg(varDeclaration.getLine(),
                    varDeclaration.getName().getName()));
        }
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
    public Void visit(MainDeclaration mainDeclaration){
        for (Statement statement : mainDeclaration.getBody())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement){
        if (returnStatement.hasRetExpression())
            returnStatement.getReturnExp().accept(this);
        return null;
    }

    //TODO:ifstatement :

    private void visitExpressions(ArrayList<Expression> conditions){
        for(Expression condition : conditions)
            condition.accept(this);
    }

    private void visitStatements (ArrayList<Statement> statements){
        for (Statement statement : statements)
            statement.accept(this);
    }

    @Override
    public Void visit(IfStatement ifStatement){
        visitExpressions(ifStatement.getConditions());

        SymbolTable ifStatementSymbolTable = new SymbolTable();
        SymbolTable.push(ifStatementSymbolTable);
        visitStatements(ifStatement.getThenBody());
        SymbolTable.pop();
        SymbolTable elseStatementSymbolTable = new SymbolTable();
        SymbolTable.push(elseStatementSymbolTable);
        visitStatements(ifStatement.getElseBody());
        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(PutStatement putStatement){
        putStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(LenStatement lenStatement){
        lenStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(PushStatement pushStatement){
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return null;
    }

    //TODO:visit loopDo:

    @Override
    public Void visit(LoopDoStatement loopDoStatement){

        SymbolTable loopDoStatementSymbolTable = new SymbolTable();
        SymbolTable.push(loopDoStatementSymbolTable);
        visitExpressions(loopDoStatement.getLoopConditions());
        visitStatements(loopDoStatement.getLoopBodyStmts());
        loopDoStatement.getLoopRetStmt().accept(this);
        SymbolTable.pop();

        return null;

    }

    //TODO:visit forloop:

    @Override
    public Void visit(ForStatement forStatement){

        visitExpressions(forStatement.getRangeExpressions());

        SymbolTable forStatementSymbolTable = new SymbolTable();
        SymbolTable.push(forStatementSymbolTable);

        try {
            SymbolTable.top.put(new VarItem(forStatement.getIteratorId()));
        } catch (ItemAlreadyExists e) {}
        visitExpressions(forStatement.getLoopBodyExpressions());
        visitStatements(forStatement.getLoopBody());
        forStatement.getReturnStatement().accept(this);

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(MatchPatternStatement matchPatternStatement){
        matchPatternStatement.getMatchArgument().accept(this);
        return null;
    }

    @Override
    public Void visit(ChopStatement chopStatement){
        chopStatement.getChopExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ChompStatement chompStatement){
        chompStatement.getChompExpression().accept(this);
        return null;
    }

    //TODO:visit assign statement:

    @Override
    public Void visit(AssignStatement assignStatement){
        VarItem variableItem = new VarItem(assignStatement.getAssignedId());
        try {
            SymbolTable.top.put(variableItem);
        } catch (ItemAlreadyExists e){}
        if(assignStatement.isAccessList())
            assignStatement.getAccessListExpression().accept(this);
        assignStatement.getAssignExpression().accept(this);

        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement){
        expressionStatement.getExpression().accept(this);
        return null;
    }



    //TODO:visit all other AST nodes and find name errors



}