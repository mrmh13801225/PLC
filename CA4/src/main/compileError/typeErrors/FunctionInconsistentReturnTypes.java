package main.compileError.typeErrors;

import main.compileError.CompileError;

public class FunctionInconsistentReturnTypes extends CompileError {
    private final String functionName;
    public FunctionInconsistentReturnTypes(int line, String functionName){
        this.line = line;
        this.functionName = functionName;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> types of return expressions of the function `" + this.functionName + "` must be same";}
}
