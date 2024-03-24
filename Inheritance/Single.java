package Inheritance;

class A{
    int x=10;
    public void m1()
    {
        System.out.println("x = "+x);
    }
}
public class Single extends A{
    int y=20;
    public void m2()
    {
        System.out.println("y = "+y);
    }
    public static void main(String[] args) {
        Single s=new Single();
        s.m1();
        s.m2();
    }
}
