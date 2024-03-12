package Basics;

import java.util.Scanner;

public class Greater2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int greater =(x>y)?x:y;
         System.out.println(greater+"is greater");
        //  System.out.println(y+"is greater");
    }
    
}
