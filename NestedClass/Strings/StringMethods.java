package NestedClass.Strings;

public class StringMethods {
    public static void main(String[] args) {

        String s=new String("Apple");
        String s1=new String("Banana");
        String s2=new String("Apple");

        //char charAt(index)
        System.out.println("Char at index 3 = "+s.charAt(3));//l

        //int compareTo(Object O) lexicographically order a<b
        int r1=s.compareTo(s1);
        System.out.println("s compareTo s1 : "+r1);//-1

        int r2=s1.compareTo(s2);
        System.out.println("s1 compareTo s2 : "+r2);//1

        //
    }
}
