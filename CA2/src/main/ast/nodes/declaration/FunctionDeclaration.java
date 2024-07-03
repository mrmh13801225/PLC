package main.ast.nodes.declaration;

import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statement.Statement;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class FunctionDeclaration extends Declaration{
    private Identifier functionName;
    private ArrayList<VarDeclaration> args = new ArrayList<>();
    private ArrayList<Statement> body = new ArrayList<>();

    public Identifier getFunctionName(){return this.functionName;}
    public void setFunctionName(Identifier functionName){this.functionName = functionName;}

    public ArrayList<VarDeclaration> getArgs(){return this.args;}
    public void setArgs(ArrayList<VarDeclaration> args){this.args = args;}
    public void addArg(VarDeclaration arg){this.args.add(arg);}

    public ArrayList<Statement> getBody(){return this.body;}
    public void setBody(ArrayList<Statement> body){this.body = body;}
    public void addStmt(Statement stmt){this.body.add(stmt);}
    @Override
    public String toString(){return "FunctionDeclaration:" + this.functionName.getName();}

    public int countDefaultArgs(){
        int count = 0 ;
        for (VarDeclaration arg : args)
            if (arg.getDefaultVal() != null)
                count += 1;
        return count ;
    }

    public FunctionDeclaration copyFunctionDeclaration (Identifier id){
        FunctionDeclaration fd = new FunctionDeclaration();
        fd.setFunctionName(id);
        fd.setArgs(this.args);
        fd.setBody(this.body);
        fd.setLine(this.getLine());
        return fd;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
