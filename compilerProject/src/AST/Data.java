package AST;

import java.util.*;

public class Data {
        public String thisKeyword;
        public String dotData;
        public String nameData;
   //     public List<String> commaData;

    public Data(String thisKeyword, String dotData, String nameData){//, List<String> commaData) {
        this.thisKeyword = thisKeyword;
        this.dotData = dotData;
        this.nameData = nameData;
   //     this.commaData = commaData;
    }

    public Data() {

    }

    public String getThisKeyword() {
        return thisKeyword;
    }

    public void setThisKeyword(String thisKeyword) {
        this.thisKeyword = thisKeyword;
    }

    public String getDotData() {
        return dotData;
    }

    public void setDotData(String dotData) {
        this.dotData = dotData;
    }

    public String getNameData() {
        return nameData;
    }

    public void setNameData(String nameData) {
        this.nameData = nameData;
    }

   /* public List<String> getCommaData() {
        return commaData;
    }*/

   /* public void setCommaData(List<String> commaData) {
        this.commaData = commaData;
    }*/

    @Override
    public String toString() {
        return "2";
//                "Data{" +
//                "thisKeyword='" + thisKeyword + '\'' +
//                ", dotData='" + dotData + '\'' +
//                ", nameData='" + nameData + '\'' +
//              //  ", commaData=" + commaData +
//                '}';
    }
}