package Interface;
interface Deep
{
    void haircut();
    default void beard()
    {
        System.out.println("Trim");
    }
}

interface Addi extends Deep
{
    void facial();
}

class Demo implements Deep,Addi
{
    @Override
    public void haircut() {
        System.out.println("Haircut ");
    }
    @Override
    public void facial() {
        System.out.println("Facial");
    }
   @Override
   public void beard()
   {
    System.out.println("Shape");
   } 
}
public class DefaultInterface {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.haircut();
        d1.beard();
        d1.facial();
    }
}
