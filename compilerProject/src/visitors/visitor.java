package visitors;

import AST.*;
import AST.Class;
import SymbolTable.*;
import antlr.dartParser;
import antlr.dartParserBaseVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;


public class visitor extends dartParserBaseVisitor<Object> {
    SymbolTable symbolTable = SymbolTable.getInstance();
    SymbolList symbolTable1 = new SymbolList();


    @Override
    public Plur visitPlur(dartParser.PlurContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol PlurSymbol = new Symbol(Plur.class.getName(), null);
        instance.put(Plur.class.getTypeName(), PlurSymbol);
        this.symbolTable1.print();

        return new Plur((Class) visitClass(ctx.class_()));
    }

    @Override
    public Class visitClass(dartParser.ClassContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol class_ = new Symbol(AST.Class.class.getTypeName(), null);
        instance.put(Class.class.getName(), class_);

        BodyClass bodyClass = (BodyClass) visitBodyClass(ctx.bodyClass());
        String className = (String) ctx.CLASS_NAME(0).toString();
        String inheritsClassName = (String) ctx.CLASS_NAME(0).toString();
        Class classe = new Class(className, inheritsClassName, bodyClass);
        //list symboltable
        Rows row = new Rows();
        row.setType("Class");
        row.setValue(className.toString());
        symbolTable1.getRows().add(row);

        return classe;
    }

    @Override
    public BodyClass visitBodyClass(dartParser.BodyClassContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol bodyclass = new Symbol(AST.BodyClass.class.getTypeName(), null);
        instance.put(BodyClass.class.getName(), bodyclass);


        BodyClass bodyClass = new BodyClass();
        for (int i = 0; i < ctx.declareVariable().size(); i++) {
            if (ctx.declareVariable(i) != null) {
                bodyClass.getDeclareVariable().add((DeclareVariable) visitDeclareVariable(ctx.declareVariable(i)));
            } else bodyClass.getDeclareVariable().add(null);
        }
        bodyClass.setConstructor((Constructor) visitConstructor(ctx.constructor()));
        bodyClass.setBuild((Build) visitBuild(ctx.build()));
        //list symboltable
        Rows row = new Rows();
        row.setType("BodyClass");
        row.setValue(bodyclass.toString());
        symbolTable1.getRows().add(row);

        return bodyClass;

    }

//    @Override
//    public Body visitBody(dartParser.BodyContext ctx) {
//
//    }

    @Override
    public Constructor visitConstructor(dartParser.ConstructorContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol constructor_ = new Symbol(Constructor.class.getTypeName(), null);
        instance.put(Constructor.class.getName(), constructor_);

        Constructor constructor = new Constructor();
        constructor.setClassNameConstructor(ctx.getText());
        constructor.setData((Data) visitData(ctx.data()));
        //list symboltable
        Rows row = new Rows();
        row.setType("Constructor");
        row.setValue(constructor.toString());
        symbolTable1.getRows().add(row);

        return constructor;
    }

    @Override
    public Data visitData(dartParser.DataContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol data_ = new Symbol(Data.class.getTypeName(), null);
        instance.put(Data.class.getName(), data_);

        Data data = new Data();
        data.setThisKeyword(ctx.getText());
        data.setDotData(ctx.getText());
        data.setNameData(ctx.getText());
        //list symboltable
        Rows row = new Rows();
        row.setType("Data");
        row.setValue(data.toString());
        symbolTable1.getRows().add(row);

        return data;
    }

    @Override
    public DeclareVariable visitDeclareVariable(dartParser.DeclareVariableContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol declare_ = new Symbol(DeclareVariable.class.getTypeName(), null);
        instance.put(DeclareVariable.class.getName(), declare_);
        String name = ctx.NAMEVARIABLE().toString();
        DeclareVariable declareVariable = new DeclareVariable((DataType) visitDataType(ctx.dataType()), name);

        //list symboltable
        Rows row = new Rows();
        row.setType("declareVariable");
        row.setValue(declareVariable.toString());
        symbolTable1.getRows().add(row);

        return declareVariable;
    }

    @Override
    public DataType visitDataType(dartParser.DataTypeContext ctx) {

        SymbolTable instance = SymbolTable.getInstance();
        Symbol dataType_ = new Symbol(DataType.class.getTypeName(), null);
        instance.put(DataType.class.getName(), dataType_);
//        //list symboltable
        Rows row = new Rows();
//        row.setType("Class");
//        row.setValue(className.toString());
//        symbolTable1.getRows().add(row);
        DataType dataType = new DataType();
        if (ctx.INT() != null) {
            dataType.setDataType(ctx.INT().toString());
            row.setType("INT");
            row.setValue("int");
        }


//            return new DataType(ctx.INT().toString());
        if (ctx.BOOLEAN() != null) {
            dataType.setDataType(ctx.BOOLEAN().toString());
            row.setType("BOOLEAN");
            row.setValue("boolean");
        }
        //   return new DataType(ctx.BOOLEAN().toString());
        if (ctx.STRING() != null) {
            dataType.setDataType(ctx.STRING().toString());
            row.setType("STRING");
            row.setValue("string");
        } else dataType.setDataType(null);
        return dataType;
    }


    @Override
    public Widget visitWidget(dartParser.WidgetContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol widget_ = new Symbol(Widget.class.getTypeName(), null);
        instance.put(Widget.class.getName(), widget_);
        //list symboltable
        Rows row = new Rows();
        Widget widget = new Widget();
        if (ctx.row() != null) {
            widget.row = visitRow(ctx.row());
            row.setType("Row");
            row.setValue(widget.row.toString());
            symbolTable1.getRows().add(row);
            return widget;
        } else if (ctx.column() != null) {
            widget.column = visitColumn(ctx.column());
            row.setType("Column");
            row.setValue(widget.column.toString());
            symbolTable1.getRows().add(row);
            return widget;
        } else if (ctx.card() != null) {
            widget.card = visitCard(ctx.card());
            row.setType("Card");
            row.setValue(widget.card.toString());
            symbolTable1.getRows().add(row);
            return widget;
        } else if (ctx.container() != null) {
            widget.container = visitContainer(ctx.container());
            row.setType("Container");
            row.setValue(widget.container.toString());
            symbolTable1.getRows().add(row);
            return widget;
        } else if (ctx.text() != null) {
            widget.text = visitText(ctx.text());
            row.setType("Text");
            row.setValue(widget.text.toString());
            symbolTable1.getRows().add(row);
            return widget;
        } else if (ctx.gestureDetector() != null) {
            widget.gestureDetector = visitGestureDetector(ctx.gestureDetector());
            row.setType("GestureDetector");
            row.setValue(widget.gestureDetector.toString());
            symbolTable1.getRows().add(row);

            return widget;
        } else if (ctx.scaffold() != null) {
            widget.scaffold = visitScaffold(ctx.scaffold());
            row.setType("Scaffold");
            row.setValue(widget.scaffold.toString());
            symbolTable1.getRows().add(row);
            return widget;
        }


        return null;

    }

    @Override
    public Scaffold visitScaffold(dartParser.ScaffoldContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol scaffold_ = new Symbol(Scaffold.class.getTypeName(), null);
        instance.put(Scaffold.class.getName(), scaffold_);
//list symboltable
        Rows row = new Rows();
        Scaffold scaffold = new Scaffold();
        scaffold.setWidget((Widget) visitWidget(ctx.widget()));
        row.setType("Scaffold");
        row.setValue(scaffold.getWidget().toString());
        symbolTable1.getRows().add(row);
        return scaffold;
    }

    @Override
    public Build visitBuild(dartParser.BuildContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol build_ = new Symbol(Build.class.getTypeName(), null);
        instance.put(Build.class.getName(), build_);
        Return return_;

        return_ = visitReturn(ctx.return_());
        Widget widget = return_.getWidget();
        Build build = new Build(widget, return_);
        Rows row = new Rows();
        row.setType("Build");
        row.setValue(build.getWidget().toString());
        symbolTable1.getRows().add(row);
        return build;
    }

    @Override
    public Return visitReturn(dartParser.ReturnContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol retur = new Symbol(Return.class.getTypeName(), null);
        instance.put(Return.class.getName(), retur);

        Widget widget = visitWidget(ctx.widget());
        Return returnn = new Return(widget);
        Rows row = new Rows();
        row.setType("Return");
        row.setValue(returnn.getWidget().toString());
        symbolTable1.getRows().add(row);
        return returnn;
    }

    @Override
    public Row visitRow(dartParser.RowContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol row_ = new Symbol(Row.class.getTypeName(), null);
        instance.put(Row.class.getName(), row_);
        Row row = new Row();
        row.setChildren((Children) visitChildren(ctx.children()));
        Rows rows = new Rows();
        rows.setType("Return");
        rows.setValue(row.children.toString());
        symbolTable1.getRows().add(rows);
        return row;
    }

    @Override
    public Column visitColumn(dartParser.ColumnContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol column_ = new Symbol(Column.class.getTypeName(), null);
        instance.put(Column.class.getName(), column_);
        Column column = new Column((Children) visitChildren(ctx.children()));
        Rows rows = new Rows();
        rows.setType("Column");
        rows.setValue(column.children.toString());
        symbolTable1.getRows().add(rows);
        return column;
    }

    @Override
    public Text visitText(dartParser.TextContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol text_ = new Symbol(Text.class.getTypeName(), null);
        instance.put(Text.class.getName(), text_);
        String t = String.valueOf(ctx.InputIntoText());
        //list symboltable
        Rows row = new Rows();
        row.setType("Text");
        row.setValue(t);
        symbolTable1.getRows().add(row);

        return new Text(t);
    }

    @Override
    public Container visitContainer(dartParser.ContainerContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol container_ = new Symbol(Container.class.getTypeName(), null);
        instance.put(Container.class.getName(), container_);
        Container container = new Container();
        if (ctx.child() != null)
            container.setChild((Child) visitChild(ctx.child()));
            //return new Container((Child) visitChild(ctx.child()));
        else
            container.setChild((Child) visitChild(ctx.child()));
        //list symboltable
        Rows row = new Rows();
        row.setType("Container");
        row.setValue(container.getChild().toString());
        symbolTable1.getRows().add(row);

        return container;
    }

    @Override
    public GestureDetector visitGestureDetector(dartParser.GestureDetectorContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol gestureDetector_ = new Symbol(GestureDetector.class.getTypeName(), null);
        instance.put(GestureDetector.class.getName(), gestureDetector_);

        GestureDetector gestureDetector = new GestureDetector();
        //list symboltable
        Rows row = new Rows();
        row.setType("GestureDetector");
        row.setValue(gestureDetector.getChild().toString());
        symbolTable1.getRows().add(row);

        return gestureDetector;
    }

    @Override
    public Card visitCard(dartParser.CardContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol card_ = new Symbol(Card.class.getTypeName(), null);
        instance.put(Card.class.getName(), card_);
        Card card = new Card();
        //list symboltable
        Rows row = new Rows();
        row.setType("Card");
        row.setValue(card.getChild().toString());
        symbolTable1.getRows().add(row);
        return card;
    }

//    @Override
//    public String visitOnTap(dartParser.OnTapContext ctx) {
//        return OnTap;
//    }


    @Override
    public Child visitChild(dartParser.ChildContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol child_ = new Symbol(Child.class.getTypeName(), null);
        instance.put(Child.class.getName(), child_);

        Child child = new Child();
        if (ctx.widget() != null) {
            visitWidget(ctx.widget(0));
            return child;
        }

        //list symboltable
        Rows row = new Rows();
        row.setType("Child");
        row.setValue(child.widget.toString());
        symbolTable1.getRows().add(row);
        return child;
    }


    @Override
    public Widgets visitWidgets(dartParser.WidgetsContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol widgets_ = new Symbol(Widgets.class.getTypeName(), null);
        instance.put(Widgets.class.getName(), widgets_);

        Widgets widgets = new Widgets();
        for (int i = 0; i < ctx.widget().size(); i++) {
            if (ctx.widget(i) != null) {
                widgets.getWidgets().add((Widget) visitWidget(ctx.widget(i)));
            }

        }
        //list symboltable
        Rows row = new Rows();
        row.setType("Widgets");
        row.setValue(widgets.getWidgets().toString());
        symbolTable1.getRows().add(row);
        return widgets;
    }

    @Override
    public Children visitChildren(dartParser.ChildrenContext ctx) {
        SymbolTable instance = SymbolTable.getInstance();
        Symbol children_ = new Symbol(Children.class.getTypeName(), null);
        instance.put(Children.class.getName(), children_);
        Children children = new Children();
        children.setWidgets((List<Widgets>) visitWidgets(ctx.widgets()));
        //list symboltable
        Rows row = new Rows();
        row.setType("Children");
        row.setValue(children.getWidgets().toString());
        symbolTable1.getRows().add(row);
        return children;
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }
}
