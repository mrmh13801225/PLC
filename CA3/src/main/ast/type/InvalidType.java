package main.ast.type;

public class InvalidType extends Type{
    @Override
    public boolean equals(Object obj) {
        return false;
    }
    @Override
    public int hashCode() {
        return 500;
    }
    @Override
    public String toString() {
        return "InvalidType";
    }
}
