package Interface;
interface A
{
    public static void m1()
    {
        System.out.println("Static method");
    }
}

public class StaticInterface {
    public static void main(String[] args) {
        
        A.m1();
    }
}
