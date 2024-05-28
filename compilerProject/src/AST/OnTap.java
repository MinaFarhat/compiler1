package AST;

public class OnTap  {

        public String onTap;

        public OnTap(String onTap) {
            this.onTap = onTap;
        }

        public String getOnTap() {
            return onTap;
        }

    public void setOnTap(String onTap) {
        this.onTap = onTap;
    }

    @Override
    public String toString() {
        return "OnTap{" +
                "onTap='" + onTap + '\'' +
                '}';
    }
}


