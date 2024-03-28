package Inheritance.SuperKeyword;
class A {
    A()
    {
        System.out.println("hii");
    }
}

class B extends A {
    B()
    {
        System.out.println("hello");
    }
}
public class SuperDefConstruct {
    public static void main(String[] args) {
        B b=new B();
    }
    
}
