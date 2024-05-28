package AST;

import java.util.ArrayList;
import java.util.List;

public class Widget {
    public List<Widget> widgets =new ArrayList<>();

    public Container container ;
    public Row row ;
    public Column column;
    public Scaffold scaffold ;
    public GestureDetector gestureDetector ;
    public Text text ;
    public Card card;
    public Child child;

    public Widget(Container container, Row row, Column column, Scaffold scaffold, GestureDetector gestureDetector, Text text, Card card) {
        this.container = container;
        this.row = row;
        this.column = column;
        this.scaffold = scaffold;
        this.gestureDetector = gestureDetector;
        this.text = text;
        this.card = card;
    }
    public Widget(){}
    public Widget(Text t){
        this.text=t;
    }


    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
    public Row getRow() {
        return row;
    }
    public void setRow(Row row) {
        this.row = row;
    }
    public Column getColumn() {
        return column;
    }
    public void setColumn(Column column) {
        this.column = column;
    }
    public Scaffold getScaffold() {
        return scaffold;
    }
    public void setScaffold(Scaffold scaffold) {
        this.scaffold = scaffold;
    }
    public GestureDetector getGestureDetector() {
        return gestureDetector;
    }
    public void setGestureDetector(GestureDetector gestureDetector) {
        this.gestureDetector = gestureDetector;
    }
    public Text getText() {
        return text;
    }
    public void setText(Text text) {
        this.text = text;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    @Override
    public String toString() {
        if (scaffold != null)

            return String.valueOf(scaffold);
                    //String.valueOf(scaffold);
       else if (container != null)
            return String.valueOf(container);
       else if (row != null)
            return String.valueOf(row);
        else if (column != null)
            return String.valueOf(column);
       else if (gestureDetector != null)
            return String.valueOf(gestureDetector);
        else if (text != null)
            return String.valueOf(text);
        else if (this.getCard() != null)
            return String.valueOf(card);
        else if (this.child!=null)
            return String.valueOf(child);

        return null;
    }


}
