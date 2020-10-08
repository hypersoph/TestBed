package ca.yorku.testbed.scratch;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

public class ClassATest
{
    @Test
    public void classATest() {
        ClassA objA = new ClassA();
        System.out.println(objA.getStrA());
    }

    @Test
    public void thingTest() {
        int a = 1, b= 2, K=3;
        K= a++ + b++ +a-- -b-- - K--;
        System.out.println("1"+2+(2*3)+1);
    }

    @Test
    public void testCTest() {
        TestC c = new TestC();
        c.q = 2;
        int p = 1;
        int x = c.m2(4);
        System.out.println(x + "," + TestC.p +","+ c.q);
    }

    @Test
    public void testClassA1() {
        ClassA1 objA = new ClassA1();
        ClassA1 objB = objA;
        ClassA1 objC = new ClassA1(4);
        objA = new ClassA1(9);
        ClassA1 objD = new ClassA1(5);
        System.out.println(ClassA1.c);
    }

}
