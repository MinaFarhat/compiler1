package AST;

public class Scaffold extends Widget {


    public Widget widget;

    public Scaffold(Widget visitWidget) {
this.widget=visitWidget;
    }

    public Scaffold() {

    }


    public Widget getWidget() {
        return widget;
    }


    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "Scaffold( \n"+"body:" + widget +
                ");";
    }
}





