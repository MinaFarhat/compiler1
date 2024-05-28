package AST;

import java.util.*;

public class BodyClass {

    private List<DeclareVariable> declareVariable = new ArrayList<>();
    private Constructor constructor;
    private Build build;

    public BodyClass(){}
    public BodyClass(List<DeclareVariable> declareVariable, Constructor constructor, Build build) {
        this.declareVariable = declareVariable;
        this.constructor = constructor;
        this.build = build;
    }

    public List<DeclareVariable> getDeclareVariable() {
        return declareVariable;
    }

    public void setDeclareVariable(List<DeclareVariable> declareVariable) {
        this.declareVariable = declareVariable;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }


    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for (DeclareVariable declareVariable : this.declareVariable) {
            stringBuilder.append(declareVariable);
            stringBuilder.append("\n");
        }
        return  stringBuilder +
                "\n" + constructor +
                 build
                ;
    }
}
