package AST;

public class Card extends Widget {

        public Child child;

        public Card(String card, String opCard, Child child) {

            this.child = child;
        }

    public Card(Child visitChild) {
            this.child=visitChild;
    }

    public Card() {

    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
//تعديل  بالعرض
    @Override
    public String toString() {
        return "Card(" +
                 child +
                ')';
    }
}
