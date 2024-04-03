package NestedClass;

interface Anonymous
{
    void show();
}
public class AnonymousInnerInterface {
    public static void main(String[] args) {
        Anonymous a=new Anonymous() 
        {
            public void show()
            {
                System.out.println("Anonymous class implements interface");
            }    
        };
        a.show();
        System.out.println(a.getClass().getName());
    }
}
