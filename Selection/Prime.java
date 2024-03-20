package Selection;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num:");
        int n=sc.nextInt();
        int i=2;
        while(n%i!=0)
        {
            i++;
        }
        if (n==i)
         {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Non-Prime Number");
        }
    }
}
