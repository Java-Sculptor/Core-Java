package Polymorphism;

public class Overloading {
    void add()
    {
        int x=10,y=20,z;
        z=x+y;
        System.out.println(z);
    }

    int add(int x,int y)
    {
        int z=x+y;
        return z;
    }

    double add(int x,double y)
    {
        double z=x+y;
        return z;
    }

    public static void main(String[] args) {
        Overloading m=new Overloading();
        m.add();
        System.out.println(m.add(100, 20.36));
        System.out.println(m.add(100, 200));
    }
}
