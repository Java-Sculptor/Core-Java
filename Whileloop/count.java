package Whileloop;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num:");
        int n=sc.nextInt();
        int c=0;
        while(n!=0)
        {
            n/=10;
            c++;
        }
        System.out.println("Number of digits = "+c);
    }
    
}
