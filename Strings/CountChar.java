package Strings;

public class CountChar {
    

    public static void main(String[] args) {
        String s="abbccc";
        int a[]=new int [127];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)]+=1;
        }

        int max=-1;
        char c=' ';
        for(int i=0;i<s.length();i++)
        {
            if(max<a[s.charAt(i)])
            {
                max=a[s.charAt(i)];
                c=s.charAt(i);
            }
        }
        System.out.println("Max repeated char = "+c);
    }
}
