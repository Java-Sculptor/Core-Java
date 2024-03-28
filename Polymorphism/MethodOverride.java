package Polymorphism;
class Papa {
    public void Marry() {
        System.out.println("Parent Method : Katrina");
    }
}
public class MethodOverride extends Papa {
    @Override
    public void Marry() {
        System.out.println("Child Method : Kiara");
    }

    public static void main(String[] args) {
        Papa p=new MethodOverride();
        p.Marry();
    }
}
