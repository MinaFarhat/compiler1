package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolList {
    List<Rows> rows = new ArrayList<>();

    public List<Rows> getRows() {
        return rows;
    }

    public void setRows(List<Rows> rows) {
        this.rows = rows;


    }
    public  void print()
    {
        for (int i = 0 ; i < rows.size() ; i++)
        {
            if (rows.get(i)!= null)
            {
                System.out.println(rows.get(i).getType() + "  :   " + rows.get(i).getValue());
            }
        }
    }

}
