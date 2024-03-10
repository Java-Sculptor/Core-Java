package Basics;

public class Swap {
    public static void main(String[] args) {
        int a=4;
        int b=7;
        //with 3rd var
        // int t=0;
        // t=a;
        // a=b;
        // b=t;

        //without 3rd var
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+" "+b);
    }
    
}
