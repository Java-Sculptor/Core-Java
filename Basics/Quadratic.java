package Basics;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coefficient of quadratic equation :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d1,d2;
        d1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        d2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Root of "+a+"x^2 + "+b+"x + "+c+" are "+d1+" & "+d2);
        
    }
    
}
