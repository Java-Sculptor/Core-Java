package Inheritance.SuperKeyword;

class Super {
    String str="Deepak";
    public void show() {
        System.out.println(str);
    }
}

class Variable extends Super{
    String str="Advait";
    public void Display() {
        System.out.println(str);
        System.out.println(super.str);
    }
}
public class SuperVar {
    public static void main(String[] args) {
        Variable v=new Variable();
        v.show();
        v.Display();
    }
}
