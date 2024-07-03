package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.ArgMisMatch;
import main.compileError.nameErrors.CircularDependency;
import main.compileError.nameErrors.DuplicateArg;
import main.compileError.nameErrors.FunctionNotDeclared;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.PatternItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.symbolTable.utils.Graph;

import java.util.ArrayList;
import java.util.List;

public class DependencyDetector extends Visitor<Void> {
    public ArrayList<CompileError> dependencyError = new ArrayList<>();
    private Graph dependencyGraph = new Graph();

    private String functionName ;

    @Override
    public Void visit(Program program) {

        functionName = null ;

        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            functionDeclaration.accept(this);
        }

        return null;
    }
    //TODO:visit function declarations and construct dependency graph

    private void visitExpressions(ArrayList<Expression> conditions) {
        for (Expression condition : conditions)
            condition.accept(this);
    }

    private void visitStatements(ArrayList<Statement> statements) {
        for (Statement statement : statements)
            statement.accept(this);
    }

    private void visitVarDeclarations(ArrayList<VarDeclaration> vars) {
        for (VarDeclaration vd : vars) {
            vd.accept(this);
        }
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {

        functionName = functionDeclaration.getFunctionName().getName();

        visitVarDeclarations(functionDeclaration.getArgs());
        visitStatements(functionDeclaration.getBody());

        functionName = null;

        return null;
    }

    @Override
    public Void visit(AssignStatement assignStatement) {

        assignStatement.getAssignExpression().accept(this);
        if (assignStatement.isAccessList())
            assignStatement.getAccessListExpression().accept(this);

        return null;

    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {

        expressionStatement.getExpression().accept(this);

        return null;

    }

    @Override
    public Void visit(ForStatement forStatement) {

        forStatement.getReturnStatement().accept(this);
        visitStatements(forStatement.getLoopBody());
        visitExpressions(forStatement.getRangeExpressions());
        visitExpressions(forStatement.getLoopBodyExpressions());

        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement) {

        visitExpressions(ifStatement.getConditions());
        visitStatements(ifStatement.getElseBody());
        visitStatements(ifStatement.getThenBody());

        return null;
    }

    @Override
    public Void visit(LoopDoStatement loopDoStatement) {

        visitStatements(loopDoStatement.getLoopBodyStmts());
        visitExpressions(loopDoStatement.getLoopConditions());
        loopDoStatement.getLoopRetStmt().accept(this);

        return null;
    }

    @Override
    public Void visit(PushStatement pushStatement) {

        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);

        return null;
    }

    @Override
    public Void visit(PutStatement putStatement) {

        putStatement.getExpression().accept(this);

        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement) {

        if (returnStatement.hasRetExpression())
            returnStatement.getReturnExp().accept(this);

        return null;
    }

    @Override
    public Void visit(ListValue listValue) {

        visitExpressions(listValue.getElements());

        return null;
    }

    @Override
    public Void visit(LambdaExpression lambdaExpression) {

        visitVarDeclarations(lambdaExpression.getDeclarationArgs());
        visitStatements(lambdaExpression.getBody());

        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {

        unaryExpression.getExpression().accept(this);

        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {

        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);

        return null;
    }

    @Override
    public Void visit(AppendExpression appendExpression) {

        appendExpression.getAppendee().accept(this);
        visitExpressions(appendExpression.getAppendeds());

        return null;

    }

    @Override
    public Void visit(ChopStatement chopStatement) {

        chopStatement.getChopExpression().accept(this);

        return null;

    }

    @Override
    public Void visit(ChompStatement chompStatement) {

        chompStatement.getChompExpression().accept(this);

        return null;

    }

    @Override
    public Void visit(MatchPatternStatement matchPatternStatement) {

        matchPatternStatement.getMatchArgument().accept(this);

        return null;
    }

    @Override
    public Void visit(LenStatement lenStatement) {

        lenStatement.getExpression().accept(this);

        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {

        if (varDeclaration.getDefaultVal() != null)
            varDeclaration.getDefaultVal().accept(this);

        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression) {
        if (accessExpression.isFunctionCall() && accessExpression.getAccessedExpression() instanceof Identifier id) {
            if (functionName != null){
                dependencyGraph.addEdge(functionName ,id.getName() );
            }
        } else if (accessExpression.isFunctionCall() && accessExpression.getAccessedExpression() instanceof
                LambdaExpression lambdaExpression) {
            lambdaExpression.accept(this);
        } else if (!accessExpression.isFunctionCall() && accessExpression.getAccessedExpression() instanceof Expression ex) {
            ex.accept(this);
        }

        visitExpressions(accessExpression.getArguments());
        visitExpressions(accessExpression.getDimentionalAccess());

        return null;
    }

    public Void findDependency() {

        ArrayList<List<String>> dependencies = dependencyGraph.findCycles();

        for (List<String> cycle : dependencies){
            dependencyError.add(new CircularDependency(cycle));
        }

        return null;
    }

}