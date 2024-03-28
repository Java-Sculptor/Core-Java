package Polymorphism;
class Hide {
    public static void show() {
        System.out.println("Parent");
    }
}
public class MethodHiding extends Hide {
    public static void show() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Hide h=new MethodHiding();
        h.show();
    }
}
