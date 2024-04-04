package NestedClass;

import NestedClass.Outter.Nested;

class Outter
{
    static class Nested
    {
        public static void m1()
        {
            System.out.println("Static nested class static method");
        }

        public  void m2()
        {
            System.out.println("Static nested class non-static method");
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        Nested.m1();
        Nested n=new Nested();
        n.m2();
        System.out.println(n.getClass().getName());
    }
}
