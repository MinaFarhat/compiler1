package SymbolTable;

import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Stack;

public class SymbolTable {
    private final Stack<HashMap<String, Symbol>> scopes;
    private static SymbolTable instance;
    private SymbolTable() {
        scopes = new Stack<>();
        scopes.push(new HashMap<>());
    }
    public void enterScope() {
        scopes.push(new HashMap<String, Symbol>());
    }
    public void exitScope() {
        scopes.pop();
    }
    public void put(String name, Symbol sym) {
        scopes.peek().put(name, sym);
    }
    public Symbol get(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Symbol sym = scopes.get(i).get(name);
            if (sym != null) {
                return sym;
            }
        }
        return null;
    }
    public boolean contains(String name) {
        return get(name) != null;
    }
    public static SymbolTable getInstance() {
        if (instance == null) {
            instance = new SymbolTable();
        }
        return instance;
    }
    List<Rows> rows = new ArrayList<>();
    public List<Rows> getRows() {
        return rows;
    }
    public void setRows(List<Rows> rows) {
        this.rows = rows;


    }
   public  void print() {
        for (int i = 0 ; i < scopes.size() ; i++)
        {
            if (scopes.get(i)!= null)
            {
                System.out.println(i + ": " + scopes.get(i));
            }
        }
    }
}

