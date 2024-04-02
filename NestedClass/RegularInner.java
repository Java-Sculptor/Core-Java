package NestedClass;

import Interface.I;

class Outer 
{
    int x=8;
    public void F1()
    {
        System.out.println("Outer class Method");
    }

    class Inner 
    {
        int y=2;
        void F2()
        {
            System.out.println("Inner class Method");
            System.out.println("Outer class var in inner class x = "+x);
        }   
    }

    public void F3()
    {
        Inner I=new Inner();
        System.out.println("Inner class var in outer class y = "+I.y);
    }
}

public class RegularInner {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.F1();
        o.F3();
        Outer.Inner i=o.new Inner();
        i.F2();
    }
    
}
