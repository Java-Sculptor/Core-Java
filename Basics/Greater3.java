package Basics;

import java.util.Scanner;

public class Greater3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 3 number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int g=(a>b)?((a>c)?a:c):(b>c)?b:c;
        System.out.println("Greater num is "+g);
    }
    
}
