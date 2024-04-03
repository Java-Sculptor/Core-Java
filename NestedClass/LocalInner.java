package NestedClass;

public class LocalInner {
    public void Krma()
    {
        final int k=6;
        class Inner
        {
            public void show(int m,int n)
            {
            System.out.println("Sum = "+(m+n));
            System.out.println("Final var of method where we declare local inner class k = "+k);
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
