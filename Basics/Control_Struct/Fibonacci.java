package Basics.Control_Struct;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.println("Fibonacci Series:");
        for(int i=1;i<n-1;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    
}
