package NestedClass;

public class LocalInner {
    public void Krma()
    {
        class Inner
        {
            public void show(int m,int n)
            {
            System.out.println("Sum = "+(m+n));
            }
        }
        Inner i=new Inner();
        i.show(10,20);
    }
    public static void main(String[] args) {
        LocalInner l=new LocalInner();
        l.Krma();
    }
}
