package AST;

import java.util.*;

public class DeclareVariable {

    public DataType dataType;
    public String nameVariable;


    public DeclareVariable( DataType dataType, String nameVariable) {

        this.dataType = dataType;
        this.nameVariable = nameVariable;

    }

//    public String getDataType() {
//        return dataType;
//    }
//
//    public void setDataType(DataType dataType) {
//        this.dataType = dataType;
//    }
//
//    public String getNameVariable() {        return nameVariable;    }
//
//    public void setNameVariable(String nameVariable) {
//        this.nameVariable = nameVariable;
//    }


    @Override
    public String toString() {

//        StringBuilder stringBuilder = new StringBuilder();
//        for (DataType dataType : this.dataTypes) {
//            stringBuilder.append(dataType);
//
//            stringBuilder.append("\n");
//        }
        //هون بدها شي فوراية تانيةةةةةةةةةةةة للفاريبل
        return "final " + dataType + " " + nameVariable + ";" ;
    }
}
