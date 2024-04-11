package Strings;

public class RemoveChar {
    public static void main(String[] args) {
        String s="Hello Boy";
        char r='o';
        String result=Remove(s,r);
        System.out.println("Original String : "+s+"\nAfter removing char "+r+" : "+result);
    }

    public static String Remove(String s,char r)
    {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(c!=r)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
