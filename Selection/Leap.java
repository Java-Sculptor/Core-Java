package Selection;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an year:");
        int y=sc.nextInt();
        if(y%4==0 && y%100!=0 || y%100==0 && y%400==0)
        {
            System.out.println(y+" is Leap year");
        }
        else
        {
            System.out.println(y+" is not Leap year");
        }
    }
    
}
