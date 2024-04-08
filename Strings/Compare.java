package Strings;

public class Compare {
    public static void main(String []args)
    {
        String s1=new String("Deepak");
        String s2=new String("Deepak");

        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

        String s3="Advait";
        String s4="Advait";

        System.out.println(s3==s4);//true
        System.out.println(s3.equals(s4));
         
    }
}
