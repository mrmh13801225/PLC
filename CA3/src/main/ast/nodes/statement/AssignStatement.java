package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;


public class AssignStatement extends Statement{
    // a[2] = f[3];
    // accessList = true;
    // assignedId = new Id(a);
    // assignExpression = func(1);
    // assignOperator = EQUAL;
    // accessListExpression = 2
    private boolean accessList;
    private Identifier assignedId;
    private Expression assignExpression;
    private Expression accessListExpression;
    private AssignOperator assignOperator;
    public AssignStatement(boolean accessList, Identifier assignedId, Expression assignExpression,
                           AssignOperator assignOperator){
        this.accessList = accessList;
        this.assignedId = assignedId;
        this.assignExpression = assignExpression;
        this.assignOperator = assignOperator;
    }

    public void setAccessList(boolean accessList) {
        this.accessList = accessList;
    }

    public void setAssignedId(Identifier assignedId) {
        this.assignedId = assignedId;
    }

    public void setAccessListExpression(Expression accessListExpression) {
        this.accessListExpression = accessListExpression;
    }

    public void setAssignExpression(Expression assignExpression) {
        this.assignExpression = assignExpression;
    }

    public void setAssignOperator(AssignOperator assignOperator) {
        this.assignOperator = assignOperator;
    }

    public AssignOperator getAssignOperator() {
        return assignOperator;
    }

    public boolean isAccessList() {
        return accessList;
    }

    public Expression getAccessListExpression() {
        return accessListExpression;
    }

    public Identifier getAssignedId() {
        return assignedId;
    }

    public Expression getAssignExpression() {
        return assignExpression;
    }
    @Override
    public String toString(){return "AssignTo:"+ this.assignedId.toString();}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}

