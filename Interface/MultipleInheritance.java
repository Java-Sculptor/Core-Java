package Interface;
interface Client1 
{
    void webdesign();
}

interface Client2
{
    void database();
}

class Developer implements Client1,Client2
{
    @Override
    public void webdesign()
    {
        System.out.println("Interface Client1");
    }

    @Override
    public void database()
    {
        System.out.println("Interface Client2");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Developer d=new Developer();
    d.webdesign();
    d.database();
}
    }
    
