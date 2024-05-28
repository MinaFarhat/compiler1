package AST;

import java.util.*;

public class Child extends Widget {

    public List<Widget> widget ;

    public Child(){}


    public Child( List<Widget> widget) {
               this.widget = widget;
    }

    @Override
    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Widget widget : this.widget) {
//            stringBuilder.append(widget);
//            stringBuilder.append("\n");
//        }

        return "Child{" +

                ", widgets=" +widget+
                '}';
    }

    public void setWidget(Widget visitWidget) {
    }
}


