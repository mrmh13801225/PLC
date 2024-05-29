package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.visitor.Visitor;

import java.util.*;

public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();

    private ArrayList<Type> visitStatements (ArrayList<Statement> statements){
        ArrayList<Type> visitingResults = new ArrayList<>();

        for (Statement statement : statements)
            visitingResults.add(statement.accept(this));

        return visitingResults;
    }

    @Override
    public Type visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            }catch (ItemAlreadyExists ignored){}
        }
        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try{
                SymbolTable.root.put(patternItem);
            }catch (ItemAlreadyExists ignored){}
        }
        program.getMain().accept(this);

        return null;
    }

    private ArrayList<ReturnStatement> findReturnStatements (ArrayList<Statement> statements){
        ArrayList<ReturnStatement> returnStatements = new ArrayList<>();
        for (Statement statement : statements){
            if (statement instanceof  ReturnStatement returnStatement)
                returnStatements.add(returnStatement);
            else if (statement instanceof ForStatement forStatement)
                returnStatements.addAll(findReturnStatements(forStatement.getLoopBodyStmts()));
            else if (statement instanceof IfStatement ifStatement) {
                returnStatements.addAll(findReturnStatements(ifStatement.getThenBody()));
                returnStatements.addAll(findReturnStatements(ifStatement.getElseBody()));
            }
            else if (statement instanceof LoopDoStatement loopDoStatement)
                returnStatements.addAll(findReturnStatements(loopDoStatement.getLoopBodyStmts()));
        }
        return returnStatements;
    }

    private boolean isReturnStatementsConsistant (ArrayList<ReturnStatement> returnStatements){

        if(returnStatements.isEmpty())
            return true;

        Type returnType = returnStatements.getFirst().accept(this);
        for (int i = 1 ; i < returnStatements.size() ; i++)
            if (!returnType.sameType(returnStatements.get(i).accept(this)))
                return false;

        return true;
    }

    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        SymbolTable.push(new SymbolTable());
        SymbolTable.pushReturns(new ArrayList<>());
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();
            for (int i = 0; i < functionDeclaration.getArgs().size(); i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                argItem.setType(currentArgTypes.get(i));
                try {
                    SymbolTable.top.put(argItem);
                }catch (ItemAlreadyExists ignored){}
            }

        }catch (ItemNotFound ignored){}
        for(Statement statement : functionDeclaration.getBody()) {
            statement.accept(this);
        }


        //TODO:Figure out whether return types of functions are not the same.
        Type returnType ;
        try {
            returnType = SymbolTable.getReturnType();
        } catch (IncosistanceReturn e) {
            typeErrors.add(new FunctionIncompatibleReturnTypes(functionDeclaration.getLine(),
                    functionDeclaration.getFunctionName().getName()));
            returnType = new InvalidType();
        }
        SymbolTable.popReturns();
        SymbolTable.pop();
        return returnType;
        //TODO:Return the infered type of the function
    }
    @Override
    public Type visit(PatternDeclaration patternDeclaration){
        SymbolTable.push(new SymbolTable());
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());
            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExists ignored){}
            for(Expression expression : patternDeclaration.getConditions()){
                if(!(expression.accept(this) instanceof BoolType)){
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    SymbolTable.pop();
                    return new InvalidType();
                }
            }
            Type returnType = patternDeclaration.getReturnExp().getFirst().accept(this);
            for (int i = 1 ; i < patternDeclaration.getReturnExp().size() ; i++){
                Type temp = patternDeclaration.getReturnExp().get(i).accept(this);
                if (!returnType.sameType(temp)) {
                    typeErrors.add(new PatternIncompatibleReturnTypes(patternDeclaration.getLine(),
                            patternDeclaration.getPatternName().getName()));
                    return new InvalidType();
                }
            }
        //TODO:1-figure out whether return expression of different cases in pattern are of the same type/2-return the infered type
        }catch (ItemNotFound ignored){}


        SymbolTable.pop();
        return null;
    }
    @Override
    public Type visit(MainDeclaration mainDeclaration){
        //TODO:visit main
        SymbolTable.push(SymbolTable.top.copy());
        visitStatements(mainDeclaration.getBody());
        SymbolTable.pop();
        return null;
    }
    private Type visitFunction (FunctionItem functionItem, AccessExpression accessExpression){
        FunctionDeclaration functionDeclaration = functionItem.getFunctionDeclaration();
        ArrayList<Type> args = new ArrayList<>();
        for (int i = 0 ; i < functionDeclaration.getArgs().size() ; i++){
            if (i < accessExpression.getArguments().size()){
                args.add(accessExpression.getArguments().get(i).accept(this));
            }
            else if (functionDeclaration.getArgs().get(i).getDefaultVal() != null){
                args.add(functionDeclaration.getArgs().get(i).getDefaultVal().accept(this));
            }
            else
                args.add(new NoType());
        }
        functionItem.setArgumentTypes(args);
        Type returnType = functionDeclaration.accept(this);
        functionItem.resetArgs();
        return returnType;
    }
    @Override
    public Type visit(AccessExpression accessExpression){
        Type returnType = new NoType();
        if(accessExpression.isFunctionCall()){
            //TODO:function is called here.set the arguments type and visit its declaration
            Type accessedType = accessExpression.getAccessedExpression().accept(this);
            if (accessExpression.getAccessedExpression() instanceof Identifier id){
                try {
                    FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem("Function:" + id.getName());
                    returnType = visitFunction(functionItem, accessExpression);
                } catch (ItemNotFound e) {
                    if (accessedType instanceof FptrType fptrType){
                        try {
                            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem("Function:" +
                                    fptrType.getFunctionName());
                            returnType = visitFunction(functionItem, accessExpression);
                        } catch (ItemNotFound ignored) {}
                    }
                }
            }
        }
        else{
            Type accessedType = accessExpression.getAccessedExpression().accept(this);
            for (Expression expression : accessExpression.getDimentionalAccess()) {
                if (!(expression.accept(this) instanceof IntType)) {
                    typeErrors.add(new AccessIndexIsNotInt(expression.getLine()));
                }
            }
            if(!((accessedType instanceof ListType) || (accessedType instanceof StringType))){
                typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                return new NoType();
            }
            if ((accessedType instanceof ListType)) {
                ListType listType = (ListType) accessedType;
                returnType = listType.getType();
            }
            else if ((accessedType instanceof StringType)){
                returnType = new StringType();
            }
            //TODO:index of access list must be int
        }
        return returnType;
    }

    @Override
    public Type visit(ReturnStatement returnStatement){
        // TODO:Visit return statement.Note that return type of functions are specified here
        Type returnType = (returnStatement.hasRetExpression()) ? returnStatement.getReturnExp().accept(this) :
                new NoType();
        SymbolTable.putReturn(returnType);
        return returnType;
    }
    @Override
    public Type visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);

    }
    @Override
    public Type visit(ForStatement forStatement){
        SymbolTable.push(SymbolTable.top.copy());
        Type rangeType = forStatement.getRangeExpression().accept(this);
        VarItem varItem = new VarItem(forStatement.getIteratorId());
        varItem.setType(rangeType);
        try{
            SymbolTable.top.put(varItem);
        }catch (ItemAlreadyExists ignored){}

        for(Statement statement : forStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return null;
    }
    @Override
    public Type visit(IfStatement ifStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Expression expression : ifStatement.getConditions())
            if(!(expression.accept(this) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        for(Statement statement : ifStatement.getThenBody())
            statement.accept(this);
        for(Statement statement : ifStatement.getElseBody())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Statement statement : loopDoStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(AssignStatement assignStatement) {
        if(assignStatement.isAccessList()){
            // TODO:assignment to list
            Type id = assignStatement.getAssignedId().accept(this);
            if (id instanceof InvalidType){
                typeErrors.add(new IsNotIndexable(assignStatement.getLine()));
                return new InvalidType();
            }
            else if(id instanceof ListType listType){
                if (!listType.getType().sameType(assignStatement.getAssignExpression().accept(this))){
                    typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine()));
                    return new InvalidType();
                }
            }
            else if(id instanceof StringType string){
                if(!string.sameType(assignStatement.getAssignExpression().accept(this))){
                    typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine()));
                    return new InvalidType();
                }
            }
            else {
                typeErrors.add(new IsNotIndexable(assignStatement.getLine()));
                return new InvalidType();
            }
            if (!(assignStatement.getAccessListExpression().accept(this) instanceof IntType)){
                typeErrors.add(new AccessIndexIsNotInt(assignStatement.getLine()));
                return new InvalidType();
            }
        }
        else{
            VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
            Type assignExpressionType = assignStatement.getAssignExpression().accept(this);
            // TODO:maybe new type for a variable
            try {
                SymbolTable.top.put(newVarItem);
                newVarItem.setType(assignExpressionType);
            }catch (ItemAlreadyExists e){
                try {
                    VarItem varItem = (VarItem)SymbolTable.top.getItem("VAR:" +
                            assignStatement.getAssignedId().getName());
                    varItem.setType(assignExpressionType);
                } catch (ItemNotFound ignored) {}
            }

        }
        return new NoType();
    }
    @Override
    public Type visit(BreakStatement breakStatement){
        for(Expression expression : breakStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return new NoType();
    }
    @Override
    public Type visit(NextStatement nextStatement){
        for(Expression expression : nextStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return new NoType();
    }
    @Override
    public Type visit(PushStatement pushStatement){
        //TODO:visit push statement
        Type initialType = pushStatement.getInitial().accept(this);
        Type toBeAddedType = pushStatement.getToBeAdded().accept(this);
        if (initialType instanceof StringType stringType){
            if (!(toBeAddedType instanceof StringType))
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
        }
        else if (initialType instanceof ListType listType){ //suppose emptyListType is NoType
            if(!(listType.getType() instanceof NoType) && !listType.getType().equals(toBeAddedType)) {
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
            }
            else if (listType.getType() instanceof NoType)
                listType.setType(toBeAddedType);
        }
        else
            typeErrors.add(new IsNotPushedable(pushStatement.getLine()));
        return new NoType();
    }
    @Override
    public Type visit(PutStatement putStatement){
        //TODO:visit putStatement
        //TODO:ask what is the possible errors?
        putStatement.getExpression().accept(this);
        return new NoType();

    }
    @Override
    public Type visit(BoolValue boolValue){
        return new BoolType();
    }
    @Override
    public Type visit(IntValue intValue){
        return new IntType();
    }
    @Override
    public Type visit(FloatValue floatValue){return new FloatType();}
    @Override
    public Type visit(StringValue stringValue){
        return new StringType();
    }
    @Override
    public Type visit(ListValue listValue){
        // TODO:visit listValue
        Type listType ;
        boolean errored = false;
        if (listValue.getElements().isEmpty())
            listType = new NoType();
        else {
            listType = listValue.getElements().getFirst().accept(this);
            for (int i = 1 ; i < listValue.getElements().size() ; i++){
                if (!listType.sameType(listValue.getElements().get(i).accept(this))) {
                    if (!errored) {
                        typeErrors.add(new ListElementsTypesMisMatch(listValue.getLine()));
                        listType = new InvalidType();
                        errored = true;
                    }
                }
            }
        }

        return new ListType(listType);
    }
    @Override
    public Type visit(FunctionPointer functionPointer){
        return new FptrType(functionPointer.getId().getName());
    }
    @Override
    public Type visit(AppendExpression appendExpression){
        Type appendeeType = appendExpression.getAppendee().accept(this);
        if(!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType)){
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        return appendeeType;
    }

    private Type findBinaryExpressionType (BinaryOperator binaryOperator, Type elementType){
        if (binaryOperator.equals(BinaryOperator.DIVIDE) || binaryOperator.equals(BinaryOperator.MINUS) ||
        binaryOperator.equals(BinaryOperator.MULT) || binaryOperator.equals(BinaryOperator.PLUS))
            return elementType;
        else
            return new BoolType();
    }

    @Override
    public Type visit(BinaryExpression binaryExpression){
        //TODO:visit binary expression\
        Type firstOperandType = binaryExpression.getFirstOperand().accept(this);
        Type secondOperandType = binaryExpression.getSecondOperand().accept(this);
        if (!firstOperandType.sameType(secondOperandType)){
            typeErrors.add(new NonSameOperands(binaryExpression.getLine(), binaryExpression.getOperator()));
            return new InvalidType();
        }
        else if (!((firstOperandType instanceof FloatType) || (firstOperandType instanceof IntType))){
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getOperator().name()));
            return new InvalidType();
        }

        return findBinaryExpressionType(binaryExpression.getOperator(), firstOperandType);
    }
    @Override
    public Type visit(UnaryExpression unaryExpression){
        //TODO:visit unaryExpression
        Type operandType = unaryExpression.getExpression().accept(this);
        if (unaryExpression.getOperator() == UnaryOperator.NOT) {
            if (!(operandType instanceof BoolType)) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().name()));
                return new InvalidType();
            }
        }
        else{
            if (!((operandType instanceof FloatType) || (operandType instanceof IntType))){
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().name()));
                return new InvalidType();
            }
        }
        return operandType;
    }
    @Override
    public Type visit(ChompStatement chompStatement){
        if (!(chompStatement.getChompExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }
    @Override
    public Type visit(ChopStatement chopStatement){
        return new StringType();
    }
    @Override
    public Type visit(Identifier identifier){
        // TODO:visit Identifier
        try {
            VarItem varItem = (VarItem)SymbolTable.top.getItem("VAR:" + identifier.getName());
            return varItem.getType();
        } catch (ItemNotFound ignored) {}
        return new InvalidType();
    }
    @Override
    public Type visit(LenStatement lenStatement){
        //TODO:visit LenStatement.Be carefull about the return type of LenStatement.
        Type type = lenStatement.getExpression().accept(this);
        if (!((type instanceof StringType) || (type instanceof ListType))) {
            typeErrors.add(new LenArgumentTypeMisMatch(lenStatement.getLine()));
            return new InvalidType();
        }
        return new IntType();//TODO:may cause bugs
    }
    @Override
    public Type visit(MatchPatternStatement matchPatternStatement){
        try{
            PatternItem patternItem = (PatternItem)SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        }catch (ItemNotFound ignored){}
        return new NoType();
    }
    @Override
    public Type visit(RangeExpression rangeExpression){
        RangeType rangeType = rangeExpression.getRangeType();
        Type type = new NoType();

        if(rangeType.equals(RangeType.LIST)){
            if (rangeExpression.getRangeExpressions().isEmpty())
                return new NoType();
            Type firstElementType = rangeExpression.getRangeExpressions().getFirst().accept(this);
            for (int i = 1 ; i < rangeExpression.getRangeExpressions().size() ; i++){
                if (!firstElementType.sameType(rangeExpression.getRangeExpressions().get(i).accept(this))){
                    typeErrors.add(new ListElementsTypesMisMatch(rangeExpression.getLine()));
                    return new InvalidType();
                }
            }
            type = firstElementType;
            // TODO --> mind that the lists are declared explicitly in the grammar in this node, so handle the errors
        } else if (rangeType.equals(RangeType.DOUBLE_DOT)) {
            if (!((rangeExpression.getRangeExpressions().getFirst().accept(this) instanceof IntType) &&
                    (rangeExpression.getRangeExpressions().getLast().accept(this) instanceof IntType))){
                typeErrors.add(new RangeValuesMisMatch(rangeExpression.getLine()));
                return new InvalidType();
            }
            type = new IntType();
        }
        else {
            Type id = rangeExpression.getRangeExpressions().getFirst().accept(this);
            if (id instanceof ListType listType){
                type = listType.getType();
                if (listType.getType() instanceof InvalidType) {
                    typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
                    return new InvalidType();
                }
            }
            else{
                typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
                return new InvalidType();
            }
        }

        return type;
    }
}
