package AST;

import java.util.*;

public class Children  extends Widget{
    public String childrenType;
    public String twodotChildren;
    public List<Widgets> widgets = new ArrayList<>();

    public Children(){}
    public Children(String childrenType, String twodotChildren, List<Widgets> widgets) {
        this.childrenType = childrenType;
        this.twodotChildren = twodotChildren;
        this.widgets = widgets;
    }

    public Children(Widgets visitWidgets) {
        this.widgets.add(visitWidgets);
    }

    public String getChildrenType() {
        return childrenType;
    }

    public void setChildrenType(String childrenType) {
        this.childrenType = childrenType;
    }

    public String getTwodotChildren() {
        return twodotChildren;
    }

    public void setTwodotChildren(String twodotChildren) {
        this.twodotChildren = twodotChildren;
    }

    public List<Widgets> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<Widgets> widgets) {
        this.widgets = widgets;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for (Widgets widget : this.widgets) {
            stringBuilder.append(widget);
            stringBuilder.append("\n");
        }
        return "Children{" +

                ", widgets=" + stringBuilder +
                '}';
    }
}







