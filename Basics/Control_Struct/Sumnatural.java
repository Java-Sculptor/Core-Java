package Basics.Control_Struct;

import java.util.Scanner;

public class Sumnatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an limt:");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s+=i;
        }
        System.out.println("Sum = "+s);
    }
    
}
