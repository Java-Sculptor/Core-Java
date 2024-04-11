package Strings;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s=sc.nextLine();
        int count=CountWord(s);
        System.out.println("Number of words in a String :"+count);
        sc.close();
    }

    public static int CountWord(String str)
    {
        if (str==null || str.isEmpty()) 
        {
            return 0;
        }
        
        String w[]=str.trim().split("\\s");
        return w.length;
        
    }
}
