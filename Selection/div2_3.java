package Selection;

import java.util.Scanner;

public class div2_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num:");
        int n=sc.nextInt();
        if(n%2==0 && n%3==0)
        {
            System.out.println(n+" is divide by 2 & 3");
        }
        else
        {
            System.out.println(n+" is not divide by 2 & 3");
        }
    }
    
}
