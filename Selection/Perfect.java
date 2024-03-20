package Selection;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any num:");
    int n=sc.nextInt();
    int i=1,s=0;
    while(i<=n/2)
    {
        if (n%i==0) {
            s+=i;
        }
        i++;
    }
    if (s==n) {
        System.out.println("Perfect num");
    }
    else
    {
        System.out.println("Not-perfect num");
    }
}
}