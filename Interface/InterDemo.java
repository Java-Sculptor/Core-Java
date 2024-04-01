package Interface;

import java.util.Scanner;

interface Customer{
int amt=5;//public satic final int amt;
void purchace();//public abstract void purchace;
}

class Seller implements Customer {
    @Override
    public void purchace()
    {
        System.out.println("Raj needs "+amt+"kg rice...");
    }
    
    
}
public class InterDemo {
    public static void main(String[] args) {
        Seller s=new Seller();
        s.purchace();
    }
}
