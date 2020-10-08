package ca.yorku.testbed.scratch;

public class Student
{
    private static int count=0;
    String  name;
    String address;
    public Student() {
        this("NoName", "NoAddress");
    }
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        count++;
    }
    public String toString() {
        return name + "," + address;
    }
}
