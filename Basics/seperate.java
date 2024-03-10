package Basics;

import java.util.Scanner;

public class seperate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 3 digit number:");
        int n=sc.nextInt();
        int d1,d2,d3;
        d1=n/100;
        d2=(n/10)%10;
        d3=n%10;
        System.err.println(d1+"\t"+d2+"\t"+d3);
    }
    
}
