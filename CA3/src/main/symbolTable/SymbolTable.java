package main.symbolTable;

import main.ast.type.InvalidType;
import main.ast.type.NoType;
import main.ast.type.Type;
import main.symbolTable.exceptions.IncosistanceReturn;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.utils.Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public static SymbolTable top;
    public static SymbolTable root;
    public static ArrayList<Type> returnTypes = new ArrayList<>();
    private static Stack<ArrayList<Type>> returnStack = new Stack<>();
    private static Stack<SymbolTable> stack = new Stack<>();
    private Map<String, SymbolTableItem> items;
    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }
    public static void pushReturns(ArrayList<Type> returnTypes){
        if (returnTypes != null)
            returnStack.push(returnTypes);
        returnTypes = returnTypes;
    }
    public static void pop() {
        top = stack.pop();
    }
    public static void popReturns() {returnTypes = returnStack.pop();}
    public SymbolTable() {
        this.items = new HashMap<>();
    }
    public void put(SymbolTableItem item) throws ItemAlreadyExists {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExists();
        items.put(item.getKey(), item);
    }
    public static void putReturn(Type type) {
        returnTypes.add(type);
    }
    private static boolean containsInvalidReturnType (){
        for (Type type : returnTypes)
            if (type instanceof InvalidType)
                return true;

        return false;
    }
    private static boolean isReturnsInconsistant(){
        if (returnTypes.isEmpty())
            return false;
        Type type = returnTypes.getFirst();
        for (int i = 0 ; i < returnTypes.size() ; i++)
            if (!type.sameType(returnTypes.get(i)))
                return true;
        return false;
    }
    public static Type getReturnType() throws IncosistanceReturn{
        Type returnType ;
        if (containsInvalidReturnType())
            return new InvalidType();
        if (isReturnsInconsistant())
            throw new IncosistanceReturn();
        return returnTypes.getFirst();
    }
    public SymbolTableItem getItem(String key) throws ItemNotFound {
        SymbolTableItem symbolTableItem = this.items.get(key);
        if( symbolTableItem != null ){
            return symbolTableItem;
        }
        throw new ItemNotFound();
    }
    public SymbolTable copy() {
        SymbolTable newSymbolTable = new SymbolTable();
        newSymbolTable.items.putAll(this.items);
        return newSymbolTable;
    }

}
