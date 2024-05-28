package AST;

public class Class {


    public String className;

    public String inheritsClassName;

    public BodyClass bodyClass;

    public Class() {
    }



    public Class( String className, String inheritsClassName, BodyClass bodyClass) {

        this.className = className;
        this.inheritsClassName = inheritsClassName;
        this.bodyClass = bodyClass;
    }
    //    public Class(Class cl) {
//        super(cl);
//    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getInheritsClassName() {
        return inheritsClassName;
    }

    public void setInheritsClassName(String inheritsClassName) {
        this.inheritsClassName = inheritsClassName;
    }

    public BodyClass getBodyClass() {
        return bodyClass;
    }

    public void setBodyClass(BodyClass bodyClass) {
        this.bodyClass = bodyClass;
    }

    @Override
    public String toString() {
        return "Class " + className + " extends " + inheritsClassName +"{ \n" + bodyClass + " }\n";
    }
}
