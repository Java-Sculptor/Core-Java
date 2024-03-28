package Polymorphism;
class Parent {
    public void getLogin() {
        System.out.println("Login");
    }
}
public class InheritanceOverload extends Parent{
    public void getLogin(String n) {
        System.out.println(n+" Login successfully...");
    }

    public static void main(String[] args) {
        InheritanceOverload i=new InheritanceOverload();
        i.getLogin();
        i.getLogin("Deepak");
    }
}
