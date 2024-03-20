package Whileloop;

import java.util.Scanner;

public class Revnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num:");
        int n=sc.nextInt();
        int r=revNum(n);
        System.out.println(r);
    }
    public static int revNum(int n){
        int r=0;
        while (n!=0) {
             int d=n%10;
            r=r*10+d;
            n/=10;
        }
        return r;
    }
    
}
