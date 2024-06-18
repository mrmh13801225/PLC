package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final TypeChecker typeChecker;
    private final Set<String> visited;
    private FunctionItem curFunction;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private int curLabel = 0;
    private String breakLabel = null;
    private String continueLabel = null;
    private Type idType = null ;

    public CodeGenerator(TypeChecker typeChecker){
        this.typeChecker = typeChecker;
        this.visited = typeChecker.visited;
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
    }
    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }
    public String getFreshLabel(){
        String fresh = "Label_" + curLabel;
        curLabel++;
        return fresh;
    }
    public String getType(Type element){
        String type = "";
        switch (element){
            case StringType stringType -> type += "Ljava/lang/String;";
            case IntType intType -> type += "Ljava/lang/Integer;";
            case FptrType fptrType -> type += "LFptr;";
            case ListType listType -> type += "LList;";
            case BoolType boolType -> type += "Ljava/lang/Boolean;";
            case null, default -> {
            }
        }
        return type;
    }
    private void prepareOutputFolder(){
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e){
            // ignore
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException e){
            // ignore
        }
    }
    private void copyFile(String toBeCopied, String toBePasted){
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e){
            // ignore
        }
    }
    private void addCommand(String command){
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                mainFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                mainFile.write(command + "\n");
            else
                mainFile.write("\t\t" + command + "\n");
            mainFile.flush();
        } catch (IOException e){
            // ignore
        }
    }
    private void handleMainClass(){
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }

    @Override
    public String visit(Program program){
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        handleMainClass();

        for(String funcName : this.visited) {
            try {
                this.curFunction = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        funcName);
                this.curFunction.getFunctionDeclaration().accept(this);
            } catch(ItemNotFound ignored) {}
        }

        program.getMain().accept(this);
        return null;
    }

    private String getInputTypes(FunctionDeclaration functionDeclaration){
        String types = "(";
        for (VarDeclaration varDeclaration : functionDeclaration.getArgs())
            types += getType(varDeclaration.accept(typeChecker));
        types += ")";
        return types;
    }
    @Override
    public String visit(FunctionDeclaration functionDeclaration){
        slots.clear();

        String commands = "";
        String args = getInputTypes(functionDeclaration); // TODO and add to the slots
        String returnType = getType(functionDeclaration.accept(typeChecker)); // TODO
        commands += ".method public " + functionDeclaration.getFunctionName().getName();
        commands += args + returnType + "\n";
        // TODO headers, body and return with corresponding type
        commands += ".limit stack 128\n" ;
        commands += ".limit locals 128\n" ;
        for (Statement statement : functionDeclaration.getBody())
            commands += statement.accept(this);
        commands += ".end method\n";

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(MainDeclaration mainDeclaration){
        slots.clear();

        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        for (var statement : mainDeclaration.getBody())
            commands += statement.accept(this);
        commands += "return\n";
        commands += ".end method\n";

        addCommand(commands);
        return null;
    }
    public String visit(AccessExpression accessExpression){
        if (accessExpression.isFunctionCall()) {
            Identifier functionName = (Identifier)accessExpression.getAccessedExpression();
            String args = ""; // TODO
            String returnType = ""; // TODO
            return "invokestatic Main/" + functionName.getName() + args + returnType + "\n";
        }
        else {
            // TODO
        }
        //TODO
        return null;
    }
    @Override
    public String visit(AssignStatement assignStatement){
        ArrayList<String> commands = new ArrayList<>();
        Type assignmentType = assignStatement.getAssignExpression().accept(typeChecker);
        if (assignStatement.isAccessList())
            this.idType = new ListType(assignmentType);
        else
            this.idType = assignmentType;
        commands.add(assignStatement.getAssignedId().accept(this));
        this.idType = null;
        if (assignStatement.isAccessList())
            commands.add(assignStatement.getAccessListExpression().accept(this));
        else
            commands.add("pop"); //we do not need id reference for non lists
        commands.add(assignStatement.getAssignExpression().accept(this));
        String storeCommand ;
        int index = slotOf(assignStatement.getAssignedId().getName());
        if (assignStatement.isAccessList()){
            if (assignmentType instanceof IntType || assignmentType instanceof BoolType)
                storeCommand = "iastore";
            else
                storeCommand = "aastore";
        }
        else {
            String delimiter = index < 4 ? "_" : " " ;
            if (assignmentType instanceof IntType || assignmentType instanceof BoolType)
                storeCommand = "istore" + delimiter + index;
            else
                storeCommand = "astore" + delimiter + index;
        }
        commands.add(storeCommand);

        //TODO
        return String.join("\n",commands);
    }
    @Override
    public String visit(IfStatement ifStatement){
        //TODO
        ArrayList<String> commands = new ArrayList<>();
        commands.add(ifStatement.getConditions().getFirst().accept(this)); //TODO : conditions must handled in different way

        String thenL = getFreshLabel();
        String elseL = getFreshLabel();
        String exitL = getFreshLabel();

        commands.add("ifeq " + elseL);
        commands.add(thenL + ":");
        for (Statement statement : ifStatement.getThenBody())
            commands.add(statement.accept(this));

        commands.add("goto " + exitL);
        commands.add(elseL + ":");
        for (Statement statement : ifStatement.getElseBody())
            commands.add(statement.accept(this));

        commands.add(exitL + ":");
        return String.join("\n",commands);
    }
    private String getPrintValue(Expression expression, Type type){
        if (type instanceof StringType)
            return "ldc \"" + expression.accept(this) + "\"";
        else
            return "ldc " + expression.accept(this);
    }
    private String getPrintInvoker(Type type){
        if (type instanceof StringType)
            return "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ;";
        else if (type instanceof IntType)
            return "invokevirtual java/io/PrintStream/println(I)V ;";
        else
            return "invokevirtual java/io/PrintStream/println(Z)V ;";
    }
    @Override
    public String visit(PutStatement putStatement){
        ArrayList<String> commands = new ArrayList<>();
        Type printType = putStatement.getExpression().accept(typeChecker);
        this.idType = printType;
        commands.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        commands.add(getPrintValue(putStatement.getExpression(), printType));
        this.idType = null;
        commands.add(getPrintInvoker(printType));
        //TODO
        return String.join("\n",commands);
    }
    @Override
    public String visit(ReturnStatement returnStatement){
        ArrayList<String> commands = new ArrayList<>();

        if (!returnStatement.hasRetExpression())
            commands.add("return");
        else {
            Type returnType = returnStatement.getReturnExp().accept(typeChecker);
            this.idType = returnType;
            commands.add(returnStatement.getReturnExp().accept(this));
            this.idType = null;
            String returnCommand = (returnType instanceof IntType || returnType instanceof BoolType) ? "ireturn" :
                    "areturn";
            commands.add(returnCommand);
        }

        //TODO
        return String.join("\n",commands);
    }
    @Override
    public String visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }
    private ArrayList<String> getBinaryOperatorCommands(BinaryOperator binaryOperator){
        ArrayList<String> commands = new ArrayList<>();
        if (binaryOperator == BinaryOperator.PLUS)
            commands.add("iadd") ;
        else if (binaryOperator == BinaryOperator.MULT)
            commands.add("imul");
        else if(binaryOperator == BinaryOperator.DIVIDE)
            commands.add("idiv");
        else if(binaryOperator == BinaryOperator.MINUS)
            commands.add("isub");
        else {
            String trueLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
            if (binaryOperator == BinaryOperator.EQUAL)
                commands.add("if_icmpeq " + trueLabel);
            else if(binaryOperator == BinaryOperator.GREATER_EQUAL_THAN)
                commands.add("if_icmpge " + trueLabel);
            else if(binaryOperator == BinaryOperator.GREATER_THAN)
                commands.add("if_icmpgt " + trueLabel);
            else if(binaryOperator == BinaryOperator.LESS_EQUAL_THAN)
                commands.add("if_icmple " + trueLabel);
            else if(binaryOperator == BinaryOperator.LESS_THAN)
                commands.add("if_icmplt " + trueLabel);
            else if(binaryOperator == BinaryOperator.NOT_EQUAL)
                commands.add("if_icmpne" + trueLabel);
            commands.add("ldc 0");
            commands.add("goto " + exitLabel);
            commands.add(trueLabel + ":");
            commands.add("ldc 1");
            commands.add(exitLabel + ":");
        }
        return commands;
    }
    @Override
    public String visit(BinaryExpression binaryExpression){
        ArrayList<String> commands = new ArrayList<>();
        this.idType = binaryExpression.getFirstOperand().accept(typeChecker);
        commands.add(binaryExpression.getFirstOperand().accept(this));
        this.idType = binaryExpression.getSecondOperand().accept(typeChecker);
        commands.add(binaryExpression.getSecondOperand().accept(this));
        this.idType = null ;
        commands.addAll(getBinaryOperatorCommands(binaryExpression.getOperator()));
        //TODO
        return String.join("\n",commands);
    }
    @Override
    public String visit(UnaryExpression unaryExpression){
        ArrayList<String> commands = new ArrayList<>();
        this.idType = unaryExpression.getExpression().accept(typeChecker);
        commands.add(unaryExpression.getExpression().accept(this));
        this.idType = null;
        switch (unaryExpression.getOperator()){
            case INC -> {
                commands.add("ldc 1");
                commands.add("iadd");
            }
            case DEC -> {
                commands.add("idc -1");
                commands.add("iadd");
            }
            case MINUS -> {
                commands.add("idc -1");
                commands.add("imul");
            }
            case NOT -> {
                commands.add("ldc 1");
                commands.add("ixor");
            }
        }
        //TODO
        return String.join("\n",commands);
    }
    @Override
    public String visit(Identifier identifier){
        ArrayList commands = new ArrayList<>();
        String idName = identifier.getName();
        int index = slotOf(idName);
        String loader ;
        if (this.idType instanceof IntType || this.idType instanceof BoolType)
            loader = "iload ";
        else
            loader = "aload ";

        commands.add(loader + index);
        return String.join("\n",commands);
    }
    @Override
    public String visit(LoopDoStatement loopDoStatement){

        ArrayList<String> commands = new ArrayList<>();
        String loopStart = getFreshLabel();
        String afterLoop = getFreshLabel();
        breakLabel = afterLoop;
        continueLabel = loopStart;

        commands.add(loopStart + ":");
        for (Statement statement : loopDoStatement.getLoopBodyStmts())
            commands.add(statement.accept(this));//TODO: remember idType my cause bugs;
        commands.add("goto " + loopStart);
        commands.add(afterLoop + ":");

        breakLabel = null;
        continueLabel = null;
        //TODO
        return String.join("\n",commands);
    }
    @Override
    public String visit(BreakStatement breakStatement){

        ArrayList<String> commands = new ArrayList<>();
        if (breakLabel != null){
            if (!breakStatement.getConditions().isEmpty()){
                 //TODO: correct the condition checking logic
                commands.add(breakStatement.getConditions().getFirst().accept(this));
                commands.add("ifne " + breakLabel);
            }
            else
                commands.add("goto " + breakLabel);
        }
        //TODO
        return String.join("\n",commands);
    }
    @Override
    public String visit(NextStatement nextStatement){
        ArrayList<String> commands = new ArrayList<>();
        if (continueLabel != null){
            if (!nextStatement.getConditions().isEmpty()){
                //TODO: correct the condition checking logic
                commands.add(nextStatement.getConditions().getFirst().accept(this));
                commands.add("ifne " + continueLabel);
            }
            else
                commands.add("goto " + continueLabel);
        }
        //TODO
        return String.join("\n",commands);
    }
    @Override
    public String visit(LenStatement lenStatement){
        ArrayList<String> commands = new ArrayList<>();
        Type type = lenStatement.getExpression().accept(typeChecker);
        this.idType = type;
        commands.add(lenStatement.getExpression().accept(this));
        this.idType = null;
        if (type instanceof StringType)
            commands.add("invokevirtual java/lang/String/length()I");
        else
            commands.add("invokevirtual java/util/ArrayList/size()I");
        //TODO
        return String.join("\n",commands);
    }
    @Override
    public String visit(ChopStatement chopStatement){
        ArrayList<String> commands = new ArrayList<>();
        this.idType = chopStatement.getChopExpression().accept(typeChecker);
        String reference = chopStatement.getChopExpression().accept(this);
        this.idType = null;
        commands.add(reference);
        commands.add("ldc 0");
        commands.add(reference);
        commands.add("invokevirtual java/lang/String/length()I");
        commands.add("ldc 2");
        commands.add("isub");
        commands.add("invokevirtual java/lang/String/substring(II)Ljava/lang/String;");
        //commands.add("pop"); //TODO : maybe uncomment?
        return String.join("\n",commands);
    }

    @Override
    public String visit(FunctionPointer functionPointer){
        FptrType fptr = (FptrType) functionPointer.accept(typeChecker);
        String commands = "";
        commands += "new Fptr\n";
        commands += "dup\n";
        commands += "aload_0\n";
        commands += "ldc " + "\"" + fptr.getFunctionName() + "\"\n";
        commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        return commands;
    }

    private String findInvoker (ListType listType){
        if (listType.getType() instanceof IntType)
            return "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
        else if (listType.getType() instanceof BoolType)
            return "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
        else
            return null;
    }
    @Override
    public String visit(ListValue listValue){
        ArrayList<String> commands = new ArrayList<>();
        ListType listType = (ListType) listValue.accept(typeChecker);
        String invoker = findInvoker(listType);

        commands.add("new java/util/ArrayList");
        commands.add("dup");
        commands.add("invokespecial java/util/ArrayList/<init>()V");

        for (Expression expression : listValue.getElements()){
            this.idType = expression.accept(typeChecker);
            commands.add(expression.accept(this));
            this.idType = null;
            commands.add("dup");
            if (invoker != null)
                commands.add(invoker);
            commands.add("invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z");
            commands.add("pop");
        }

        return String.join("\n",commands);
    }

    @Override
    public String visit(IntValue intValue){
        //TODO, use "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer" to convert to primitive
        return "ldc " + intValue.getIntVal(); // choosed not to convert it to Integer hear.
    }
    @Override
    public String visit(BoolValue boolValue){
        int boolVal = boolValue.getBool() ? 1 : 0 ;
        //TODO, use "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean" to convert to primitive
        return "ldc " + boolVal;
    }
    @Override
    public String visit(StringValue stringValue){
        //TODO
        return "ldc \"" + stringValue.getStr() + "\"";
    }
}