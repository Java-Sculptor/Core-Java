package NestedClass;

interface MyInterface
{
    void display();
}
public class MrthodArgu {
    public static void main(String[] args) {
        Method(new MyInterface() {
            @Override
            public void display()
            {
                System.out.println("Anonymous inner class as method argument");
            }
        });
    }
    static void Method(MyInterface obj) {
        obj.display();
    }
}
