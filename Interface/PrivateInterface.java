package Interface;
interface Intra
{
    default void call()
    {
        add(10,20);
    }
    private void add(int x,int y)
    {
        System.out.println("Sum = "+(x+y));
    }
}
class Damn implements Intra
{
    public void sub(int x,int y)
    {
        System.out.println("Sub = "+(x-y));
    }
}
public class PrivateInterface {
    public static void main(String[] args) {
        Damn d=new Damn();
    d.call();
    d.sub(20,10);
    }
    

}
