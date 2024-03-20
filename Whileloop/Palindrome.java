package Whileloop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num:");
        int n=sc.nextInt();
        if(revNum(n))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Non-Palindrome");
        }
    }
        public static boolean revNum(int n)
        {
            int og=n;
            int r=0;
        while (n!=0) {
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        return og==r;
    
    }
}
