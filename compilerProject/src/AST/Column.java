package AST;

public class Column extends Widget{


    public Children children;

    public Column(Children children) {

        this.children = children;
    }

    public Column() {

    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }


    @Override
    public String toString() {
        return "Column(" +
                 children +
                ')';
    }
}



