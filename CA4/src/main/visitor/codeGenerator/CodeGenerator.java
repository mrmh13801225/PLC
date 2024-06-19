package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
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
import main.ast.type.NoType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

import java.io.*;
import java.util.*;

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
            case ListType listType -> type += "Ljava/util/ArrayList;";
            case BoolType boolType -> type += "Ljava/lang/Boolean;";
            case null, default -> type += "V";

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
    private String getInputTypes(FunctionItem functionItem){
        String types = "(";
        for (Type type : functionItem.getArgumentTypes())
            types += getType(type);
        types += ")";
        return types;
    }
    @Override
    public String visit(FunctionDeclaration functionDeclaration){
        SymbolTable.push(new SymbolTable());
        slots.clear();
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            String commands = "";
            String args = getInputTypes(functionItem); // TODO and add to the slots
            Type rType = functionDeclaration.accept(typeChecker);
            String returnType = getType(rType); // TODO
            commands += ".method public static " + functionDeclaration.getFunctionName().getName();
            commands += args + returnType + "\n";
            // TODO headers, body and return with corresponding type
            commands += ".limit stack 128\n" ;
            commands += ".limit locals 128\n" ;
            for (int i = 0; i < functionDeclaration.getArgs().size(); i++){
                String argName = functionDeclaration.getArgs().get(i).getName().getName();
                int index = slotOf(argName);
                VarItem v = new VarItem(functionDeclaration.getArgs().get(i).getName());
                Type argType = functionItem.getArgumentTypes().get(i);
                v.setType(argType);
                if (argType instanceof IntType){
                    commands += "aload " + index + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += "istore " + index + "\n";
                }
                else if(argType instanceof BoolType){
                    commands += "aload " + index + "\n";
                    commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
                    commands += "istore " + index + "\n";
                }
                try {
                    SymbolTable.top.put(v);
                } catch (ItemAlreadyExists ignored) {}
            }
            boolean hasReturn = false;
            for (Statement statement : functionDeclaration.getBody()) {
                commands += statement.accept(this);
                if (statement instanceof ReturnStatement)
                    hasReturn = true;
            }
            if (!hasReturn)
                commands += "return\n";
            commands += ".end method\n";

            addCommand(commands);
        } catch (ItemNotFound ignored) {}
        SymbolTable.pop();
        return null;
    }
    @Override
    public String visit(MainDeclaration mainDeclaration){
        slots.clear();
        SymbolTable.push(new SymbolTable());

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
        SymbolTable.pop();
        return null;
    }
    public String getClass(Type element){
        String className = "";
        switch (element){
            case StringType stringType -> className += "java/lang/String";
            case IntType intType -> className += "java/lang/Integer";
            case BoolType boolType -> className += "java/lang/Boolean";
            case null -> className += "java/lang/Object";
            default -> {}
        }
        return className;
    }
    private String getCallArgs (AccessExpression accessExpression, FunctionItem functionItem, ArrayList<String> commands){
        String args = "(";
        int argsCount = 0 ;
        for (Expression expression : accessExpression.getArguments()){
            Type argType = expression.accept(typeChecker);
            args += getType(argType);
            commands.add(expression.accept(this).trim());
            String invoker = findInvoker(argType);
            if (invoker != null)
                commands.add(invoker);
            argsCount++;
        }
        for (int i = argsCount; i < functionItem.getArgumentTypes().size(); i++){
            args += getType(functionItem.getArgumentTypes().get(i));
            Type argType = functionItem.getFunctionDeclaration().getArgs().get(i).getDefaultVal().accept(typeChecker);
            commands.add(functionItem.getFunctionDeclaration().getArgs().get(i).getDefaultVal().accept(this).trim());
            String invoker = findInvoker(argType);
            if (invoker != null)
                commands.add(invoker);
        }
        args += ")";
        return args;
    }
    public String visit(AccessExpression accessExpression){
        ArrayList<String> commands = new ArrayList<>();
        Type type = accessExpression.accept(typeChecker);
        String functionName = "" ;
        if (accessExpression.isFunctionCall()) {
            FunctionItem functionItem = null;
            functionName = ((Identifier)accessExpression.getAccessedExpression()).getName();
            try {
                functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + functionName);
            } catch (ItemNotFound e) {
                String newFunctionName ;
                try {
                    FptrType newFunctionType =
                            (FptrType)((VarItem) SymbolTable.top.getItem(VarItem.START_KEY + functionName)).getType();
                    newFunctionName = newFunctionType.getFunctionName();
                    functionName = newFunctionName;
                } catch (ItemNotFound ex) {
                    newFunctionName = "";
                }
                try {
                    functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + newFunctionName);
                } catch (ItemNotFound ignored) {}
            }
            int argCount = 0;
            String args = getCallArgs(accessExpression, functionItem, commands);
            String returnType = getType(functionItem.getReturnType());
            commands.add("invokestatic Main/" + functionName + args + returnType);
            if (functionItem.getReturnType() instanceof IntType)
                commands.add("invokevirtual java/lang/Integer/intValue()I");
            else if(functionItem.getReturnType() instanceof BoolType)
                commands.add("invokevirtual java/lang/Boolean/booleanValue()Z");
            commands.removeAll(Arrays.asList("", null));
            return String.join("\n", commands) + "\n";
        }
        else {
            this.idType = new ListType(type);
            commands.add(accessExpression.getAccessedExpression().accept(this).trim());
            this.idType = accessExpression.getDimentionalAccess().getFirst().accept(typeChecker);
            commands.add(accessExpression.getDimentionalAccess().getFirst().accept(this).trim());
            this.idType = null ;
            commands.add("invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;");
            ListType lType = (ListType)accessExpression.getAccessedExpression().accept(typeChecker);
            commands.add("checkcast " + getClass(lType.getType()));
            // TODO
        }
        if (type instanceof IntType)
            commands.add("invokevirtual java/lang/Integer/intValue()I");
        else if (type instanceof BoolType)
            commands.add("invokevirtual java/lang/Boolean/booleanValue()Z");
        //TODO
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
    }
    @Override
    public String visit(AssignStatement assignStatement){
        ArrayList<String> commands = new ArrayList<>();
        Type assignmentType = assignStatement.getAssignExpression().accept(typeChecker);
        if (assignStatement.isAccessList()){
            commands.add(assignStatement.getAssignedId().accept(this).trim());
            commands.add(assignStatement.getAccessListExpression().accept(this).trim());

            if (assignStatement.getAssignOperator() == AssignOperator.ASSIGN){
                commands.add(assignStatement.getAssignExpression().accept(this).trim());
                String invoker = findInvoker(assignmentType);
                if (invoker != null)
                    commands.add(invoker);
                commands.add("checkcast " + getClass(null));
                commands.add("invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;");
            }
            else {
                commands.add(assignStatement.getAssignedId().accept(this));
                commands.add(assignStatement.getAccessListExpression().accept(this));
                commands.add("invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;");
                commands.add("checkcast " + getClass(new IntType()));
                commands.add("invokevirtual java/lang/Integer/intValue()I");
                commands.add(assignStatement.getAssignExpression().accept(this));
                switch (assignStatement.getAssignOperator()){
                    case MINUS_ASSIGN -> {
                        commands.add("isub");
                    }
                    case PLUS_ASSIGN -> {
                        commands.add("iadd");
                    }
                    case DIVIDE_ASSIGN -> {
                        commands.add("idiv");
                    }
                    case MOD_ASSIGN -> {
                        commands.add("irem");
                    }
                    case MULT_ASSIGN -> {
                        commands.add("imul");
                    }
                }
                commands.add("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
                commands.add("checkcast " + getClass(null));
                commands.add("invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;");
            }

        }
        else {
            commands.add(assignStatement.getAssignExpression().accept(this).trim());
            if (assignStatement.getAssignOperator() == AssignOperator.ASSIGN){
                VarItem varItem = new VarItem(assignStatement.getAssignedId());
                varItem.setType(assignmentType);
                try {
                    SymbolTable.top.put(varItem);
                } catch (ItemAlreadyExists e) {
                    try {
                        VarItem temp = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + varItem.getName());
                        temp.setType(assignmentType);
                    } catch (ItemNotFound ignored) {}
                }
                String storeCommand =
                        (assignmentType instanceof IntType || assignmentType instanceof BoolType ? "istore " : "astore ");
                commands.add(storeCommand + slotOf(assignStatement.getAssignedId().getName()));
            }
            else{
                commands.add("iload " + slotOf(assignStatement.getAssignedId().getName()));
                switch (assignStatement.getAssignOperator()){
                    case MINUS_ASSIGN -> {
                        commands.add("isub");
                        commands.add("ineg");
                        commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
                    }
                    case PLUS_ASSIGN -> {
                        commands.add("iadd");
                        commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
                    }
                    case MULT_ASSIGN -> {
                        commands.add("imul");
                        commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
                    }
                    case MOD_ASSIGN -> {
                        commands.add("swap");
                        commands.add("irem");
                        commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
                    }
                    case DIVIDE_ASSIGN -> {
                        commands.add("swap");
                        commands.add("idiv");
                        commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
                    }
                }
            }
        }
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
    }
    @Override
    public String visit(IfStatement ifStatement){
        //TODO
        SymbolTable.push(SymbolTable.top.copy());
        ArrayList<String> commands = new ArrayList<>();
        commands.add(ifStatement.getConditions().getFirst().accept(this).trim()); //TODO : conditions must handled in different way

        String elseL = getFreshLabel();
        String exitL = getFreshLabel();

        commands.add("ifeq " + elseL);
        for (Statement statement : ifStatement.getThenBody())
            commands.add(statement.accept(this).trim());

        commands.add("goto " + exitL);
        commands.add(elseL + ":");
        for (Statement statement : ifStatement.getElseBody())
            commands.add(statement.accept(this).trim());

        commands.add(exitL + ":");
        SymbolTable.pop();
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
    }
    private String getPrintInvoker(Type type){
        if (type instanceof StringType)
            return "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V";
        else if (type instanceof IntType)
            return "invokevirtual java/io/PrintStream/println(I)V";
        else
            return "invokevirtual java/io/PrintStream/println(Z)V";
    }
    @Override
    public String visit(PutStatement putStatement){
        ArrayList<String> commands = new ArrayList<>();
        Type printType = putStatement.getExpression().accept(typeChecker);
        this.idType = printType;
        commands.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        commands.add(putStatement.getExpression().accept(this).trim());
        this.idType = null;
        commands.add(getPrintInvoker(printType));
        //TODO
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
    }
    @Override
    public String visit(ReturnStatement returnStatement){
        ArrayList<String> commands = new ArrayList<>();

        if (!returnStatement.hasRetExpression())
            commands.add("return");
        else {
            Type returnType = returnStatement.getReturnExp().accept(typeChecker);
            this.idType = returnType;
            commands.add(returnStatement.getReturnExp().accept(this).trim());
            int index = slotOf("returnSlot");
            String invoker = findInvoker(returnType);
            if (invoker != null)
                commands.add(invoker);
            this.idType = null;
            String returnCommand = "areturn";
            commands.add(returnCommand);
        }

        //TODO
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
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
                commands.add("if_icmpne " + trueLabel);
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
        commands.add(binaryExpression.getFirstOperand().accept(this).trim());
        this.idType = binaryExpression.getSecondOperand().accept(typeChecker);
        commands.add(binaryExpression.getSecondOperand().accept(this).trim());
        this.idType = null ;
        commands.addAll(getBinaryOperatorCommands(binaryExpression.getOperator()));
        //TODO
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
    }
    private String getUnaryExpStoreCommand(UnaryExpression unaryExpression){
        Identifier id = (Identifier)unaryExpression.getExpression();
        int index = slotOf(id.getName());
        Type type = new NoType();
        try {
            type = ((VarItem) SymbolTable.top.getItem("VAR:" + id.getName())).getType();
        } catch (ItemNotFound ignored) {}
        String delimiter = index < 4 ? "_" : " ";
        String storeCommand = ((type instanceof IntType) || (type instanceof BoolType)) ? "istore" : "astore";
        return storeCommand + delimiter + index;
    }
    @Override
    public String visit(UnaryExpression unaryExpression){
        ArrayList<String> commands = new ArrayList<>();
        this.idType = unaryExpression.getExpression().accept(typeChecker);
        commands.add(unaryExpression.getExpression().accept(this).trim());
        this.idType = null;
        switch (unaryExpression.getOperator()){
            case INC -> {
                commands.add("ldc 1");
                commands.add("iadd");
                commands.add(getUnaryExpStoreCommand(unaryExpression));
            }
            case DEC -> {
                commands.add("ldc 1");
                commands.add("isub");
                commands.add(getUnaryExpStoreCommand(unaryExpression));
            }
            case MINUS -> {
                commands.add("ineg");
            }
            case NOT -> {
                commands.add("ldc 1");
                commands.add("ixor");
            }
        }
        //TODO
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
    }
    @Override
    public String visit(Identifier identifier){
        ArrayList commands = new ArrayList<>();
        String idName = identifier.getName();
        int index = slotOf(idName);
        try {
            Type idType = ((VarItem)SymbolTable.top.getItem("VAR:" + idName)).getType();

            String loader;
            if (idType instanceof IntType || idType instanceof BoolType)
                loader = "iload ";
            else
                loader = "aload ";

            commands.add(loader + index);
        } catch (ItemNotFound ignored) {}
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
    }
    @Override
    public String visit(LoopDoStatement loopDoStatement){

        SymbolTable.push(SymbolTable.top.copy());
        ArrayList<String> commands = new ArrayList<>();
        String loopStart = getFreshLabel();
        String afterLoop = getFreshLabel();
        breakLabel = afterLoop;
        continueLabel = loopStart;

        commands.add(loopStart + ":");
        for (Statement statement : loopDoStatement.getLoopBodyStmts())
            commands.add(statement.accept(this).trim());//TODO: remember idType my cause bugs;
        commands.add("goto " + loopStart);
        commands.add(afterLoop + ":");

        breakLabel = null;
        continueLabel = null;

        SymbolTable.pop();
        //TODO
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
    }
    @Override
    public String visit(BreakStatement breakStatement){

        ArrayList<String> commands = new ArrayList<>();
        if (breakLabel != null){
            if (!breakStatement.getConditions().isEmpty()){
                //TODO: correct the condition checking logic
                commands.add(breakStatement.getConditions().getFirst().accept(this).trim());
                commands.add("ifne " + breakLabel);
            }
            else
                commands.add("goto " + breakLabel);
        }
        //TODO
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
    }
    @Override
    public String visit(NextStatement nextStatement){
        ArrayList<String> commands = new ArrayList<>();
        if (continueLabel != null){
            if (!nextStatement.getConditions().isEmpty()){
                //TODO: correct the condition checking logic
                commands.add(nextStatement.getConditions().getFirst().accept(this).trim());
                commands.add("ifne " + continueLabel);
            }
            else
                commands.add("goto " + continueLabel);
        }
        //TODO
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
    }
    @Override
    public String visit(LenStatement lenStatement){
        ArrayList<String> commands = new ArrayList<>();
        Type type = lenStatement.getExpression().accept(typeChecker);
        this.idType = type;
        commands.add(lenStatement.getExpression().accept(this).trim());
        this.idType = null;
        if (type instanceof StringType)
            commands.add("invokevirtual java/lang/String/length()I");
        else
            commands.add("invokevirtual java/util/ArrayList/size()I");
        //TODO
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
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
        commands.add("ldc 1");
        commands.add("isub");
        commands.add("invokevirtual java/lang/String/substring(II)Ljava/lang/String;");
        //commands.add("pop"); //TODO : maybe uncomment?
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
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
    private String findInvoker (Type type){
        if (type instanceof IntType)
            return "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
        else if (type instanceof BoolType)
            return "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
        else
            return null;
    }
    @Override
    public String visit(ListValue listValue){
        ArrayList<String> commands = new ArrayList<>();
        ListType listType = (ListType) listValue.accept(typeChecker);
        String invoker = findInvoker(listType.getType());

        commands.add("new java/util/ArrayList");
        commands.add("dup");
        commands.add("invokespecial java/util/ArrayList/<init>()V");
        commands.add("astore " + slotOf("array_"));

        for (Expression expression : listValue.getElements()){
            commands.add("aload " + slotOf("array_"));
            this.idType = expression.accept(typeChecker);
            commands.add(expression.accept(this).trim());
            this.idType = null;
            if (invoker != null)
                commands.add(invoker);
            commands.add("invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z");
            commands.add("pop");
        }
        commands.add("aload " + slotOf("array_"));
        commands.removeAll(Arrays.asList("", null));
        return String.join("\n",commands) + "\n";
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
        return "ldc " + stringValue.getStr();
    }
}