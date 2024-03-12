package Basics.Control_Struct;

import java.util.Scanner;

public class oddton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num:");
        int n=sc.nextInt();
        for(int i=1;i<n;i+=2)
        {
            System.out.println(i);
        }
    }
    
}
