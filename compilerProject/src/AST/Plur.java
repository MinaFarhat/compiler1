package AST;

public class Plur {

    public Class cl;

    public Plur(Class valu) {
        this.cl = valu;
    }

    public Class getCl() {
        return cl;
    }

    public void setCl(Class cl) {
        this.cl = cl;
    }

    @Override
    public String toString() {
        return "plur{\n" +
                 cl +
                '}';
    }
}
