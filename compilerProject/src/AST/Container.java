package AST;

public class Container extends Widget {

    public Child child;

    public Container( Child child) {

        this.child = child;
    }

    public Container() {
        this.child=null;

    }


    public Child getChild() {
        return child;
    }


    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        if (child!=null)
        {
        return "Container(" +
                child +
                ");";
    }
        else
            return "aaaa";
}}


