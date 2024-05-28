package AST;

public class Build {


    public Widget widget;
    public Return returnNode;

    public Build() {}

    public Build(Widget widget, Return return_) {
        this.widget=widget;
        this.returnNode=return_;
    }


    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public Return getReturnNode() {
        return returnNode;
    }

    public void setReturnNode(Return returnNode) {
        this.returnNode = returnNode;
    }

    @Override
    public String toString() {
        return
                "@Override\n"+
                        "Widget build(BuildContext context) { "
                        + returnNode
                        +"  }\n";
    }
}
