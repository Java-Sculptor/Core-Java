package Whileloop;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numm:");
        int d=sc.nextInt();
        String b=toBinary(d);
        System.out.println(b);
    }
    public static String toBinary(int d)
    {
        StringBuilder b = new StringBuilder();
		        if (d == 0) {
		            return "0";
		        }
		        while (d!=0) {
		            int r = d % 2;
		            b.insert(0, r); // Inserting the remainder at the beginning of the string
		            d /= 2;
		        }
		        return b.toString();
		    
    }
    
}
