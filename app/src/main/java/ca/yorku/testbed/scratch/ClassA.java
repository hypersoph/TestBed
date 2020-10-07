package ca.yorku.testbed.scratch;

public class ClassA {
    private String strA="";
    private String strB="";

    public ClassA(){
        this("A");
    }
    public ClassA(String strA) {
        this(strA, "V");
        this.strA+=strA;
    }
    public ClassA(String strA, String strB) {
        this.strA +=strA;
        this.strB+= strB;
    }

    public String getStrA()
    {
        return strA;
    }
}
