package ca.yorku.testbed.scratch;

public class ClassA1
{
    private int a;
    public static int b=1;
    public static int c=1;
    public ClassA1() {
        this.a=0;
        b++;
    }
    public ClassA1(int a) {
        this.a=a;
        b++;
        c+=3;
    }
}
