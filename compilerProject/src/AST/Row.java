package AST;

import antlr.dartParser;

public class Row  extends Widget{

        public Children children = new Children();

        public Row() {

            this.children = new Children();
        }


    public void setChildren(Children children) {
        this.children = children;
    }

    public Children getChildren() {
            return children;
        }

    @Override
    public String toString() {
        return "Row(\n" +
                "children:"+
                 children+
                ");";
    }
}


