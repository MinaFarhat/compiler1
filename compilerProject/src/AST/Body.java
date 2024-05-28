package AST;

public class Body {

    public Widgets widgets;

    public Body(Widgets widgets) {
        this.widgets = widgets;
    }

    public Widgets getWidgets() {
        return widgets;
    }

    public void setWidgets(Widgets widgets) {
        this.widgets = widgets;
    }

    @Override
    public String toString() {
        return "Body{" +
                "widgets=" + widgets +
                '}';
    }
}
