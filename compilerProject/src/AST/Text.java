package AST;

public class Text extends Widget {

    public String inputIntoText;

    public Text( ) {    }

    public Text(String t) {
        this.inputIntoText=t;
    }

    public void setInputIntoText(String inputIntoText) {
        this.inputIntoText = inputIntoText;
    }

    public String getInputIntoText() {
        return inputIntoText;
    }

    @Override
    public String toString() {
        return "Text('" +
                 inputIntoText + '\'' +
                ')';
    }
}


