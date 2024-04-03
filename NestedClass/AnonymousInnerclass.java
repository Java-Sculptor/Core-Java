package NestedClass;

class Popcorn
{
    public void test()
    {
        System.out.println("spicy");
    }
}
public class AnonymousInnerclass {
    public static void main(String[] args) {
        //anonymous inner class that extends class
        Popcorn p1=new Popcorn()
        {
            public void test()
            {
                System.out.println("salty");
            }
        };
        p1.test();//salty
        System.out.println(p1.getClass().getName());

        Popcorn p2=new Popcorn();
        p2.test();//spicy
        System.out.println(p2.getClass().getName());
    }
}
