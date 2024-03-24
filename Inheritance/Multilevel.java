package Inheritance;

class Aa {
    public void m1()
    {
        System.out.println("Class Aa");
    }
}

class B extends Aa{
    public void m2() {
        System.out.println("Class B");
    }
}

public class Multilevel extends B {
    public void m3() {
        System.out.println("Multilevel class");
    }

    public static void main(String[] args) {
        Multilevel m=new Multilevel();
        m.m1();
        m.m2();
        m.m3();
    }
}
