package Basics;

import java.util.Scanner;

public class Rectangle {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length & Breath of Rectangle :");
        double l=s.nextDouble();
        double b=s.nextDouble();
        double a,p;
        a=l*b;
        p=2*(l+b);
        System.out.println("Area of Rectangle ="+a);
        System.out.println("Perimeter of Rectangle = "+p);
    }
}
