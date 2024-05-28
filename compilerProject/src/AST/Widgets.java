package AST;

import java.util.*;

public class Widgets {
    public List<Widget> widgets ;

    public Widgets(List<Widget> widgets) {
        this.widgets = widgets;
    }

    public Widgets() {    }

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets(ArrayList<Widget> widgets) {
        this.widgets = widgets;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for (Widget widget : this.widgets) {
            stringBuilder.append(widget);
            stringBuilder.append("\n");
        }
        return "Widgets{" +
                "widget=" + stringBuilder +
                '}';
    }
}

