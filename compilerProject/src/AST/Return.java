package AST;

public class Return {

    public String returnKeyword;
    public Widget widget ;

    public Return(String returnKeyword, Widget widget) {
        this.returnKeyword = returnKeyword;
        this.widget = widget;
    }

    public Return() {

    }

    public Return(Widget visitWidget) {
        this.widget=visitWidget;
    }

    public String getReturnKeyword() {
        return returnKeyword;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setReturnKeyword(String returnKeyword) {
        this.returnKeyword = returnKeyword;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "\nReturn " +widget +
                "\n";
    }
}


