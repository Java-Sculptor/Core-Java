package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String str="Nitin";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Non-Palindrome");
        }
    }
}
