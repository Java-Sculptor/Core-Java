package Whileloop;

import java.util.Scanner;

public class sump {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        int d,s=0,p=1;
        while (n!=0) {
          d=n%10;
          s+=d;
          p*=d;
          n=n/10;  
        }
        System.out.println("Sum = "+s);
        System.out.println("Product = "+p);

    }
    
}
