package Basics;

import java.util.Scanner;

public class Rev2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any 2 digit num:");
    int n=sc.nextInt();
    int d1,d2;
    d1=n%10;
    d2=n/10;
    System.out.println("Before : "+n+" After : "+d1+d2);
}    
}
