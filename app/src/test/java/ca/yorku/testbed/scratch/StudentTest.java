package ca.yorku.testbed.scratch;

import org.junit.Test;

public class StudentTest
{
    @Test
    public void StudentTest() {
        Student stdA = new Student("StudentA","AddressA");
        System.out.println(stdA);
    }
}
