package AST;

public class Constructor {

    public String classNameConstructor;
    public Data data;
    public Constructor(String classNameConstructor, Data data) {
        this.classNameConstructor = classNameConstructor;
        this.data = data;
    }

    public Constructor() {

    }

    public String getClassNameConstructor() {
        return classNameConstructor;
    }

    public void setClassNameConstructor(String classNameConstructor) {
        this.classNameConstructor = classNameConstructor;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return classNameConstructor + "(" +
                 data + "){}\n";
    }
}
