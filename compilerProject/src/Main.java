import AST.DeclareVariable;
import AST.Plur;
import SymbolTable.SymbolTable;
import antlr.*;
import antlr.dartParserBaseListener;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream.*;
import visitors.visitor;
import SymbolTable.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "F:\\Projects\\java\\projectCom\\compilerProject\\src\\test.txt";
        CharStream Cs = fromFileName(source);
        dartLexer dartLexer = new dartLexer(Cs);
        CommonTokenStream tokenStream =new CommonTokenStream(dartLexer);
        dartParser dartParser = new dartParser(tokenStream);
        dartParser.PlurContext tree = dartParser.plur();

        Plur d = (Plur) new visitor().visit(tree);

        System.out.println(d);
        SymbolTable symbolTable =SymbolTable.getInstance();
       symbolTable.print();

//        SymbolList symbolList = new SymbolList();
//        symbolList.print();


    }
}