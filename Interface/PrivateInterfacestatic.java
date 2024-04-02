package Interface;

interface Ia
{
    public static void call()
    {
        add(10,20);
    }
    private static void add(int x,int y)
    {
        System.out.println("Sum = "+(x+y));
    }
}
class Damn implements Ia
{
    public void sub(int x,int y)
    {
        System.out.println("Sub = "+(x-y));
    }
}
public class PrivateInterfacestatic  {
    public static void main(String[] args) {
        Damn d=new Damn();
    Ia.call();
    d.sub(20,10);
    }
    

}
