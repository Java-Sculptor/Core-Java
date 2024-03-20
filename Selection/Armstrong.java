package Selection;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num:");
        int n=sc.nextInt();
        int s=0;
        int og=n;
        while (n!=0) {
            int d=n%10;
            s+=d*d*d;
            n/=10;
        }
        if (og==s) {
            System.out.println("Armstrong Number");           
        }
        else
        {
            System.out.println("Non-Armstrong Number");
        }
    }
    
}
