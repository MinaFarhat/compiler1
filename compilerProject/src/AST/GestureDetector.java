package AST;

public class GestureDetector extends Widget {

        public Child child;

        public GestureDetector( Child child) {

            this.child = child;
        }

    public GestureDetector() {

    }


    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "GestureDetector(" +
                 child +
                ");";
    }
}
