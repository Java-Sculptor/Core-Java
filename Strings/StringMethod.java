package Strings;

public class StringMethod {
    
    public static void main(String[] args) {
        String s1="Apple";
        String s2="Banana";
        String s3=new String("");
        String s4=new String();

        //char charAt(int index)
        System.out.println("\nchar charAt(int index) :\n");
        System.out.println("Character at index 2 = "+s1.charAt(2));

        //obj.length()
        System.out.println("\nobj.length() : \n");
        System.out.println("Length of String s1 = "+s1.length());
        System.out.println("Length of String s3 = "+s3.length());
        System.out.println("Length of String s4 = "+s4.length());

        //isEmpty()
        System.out.println("\nisEmpty() : \n");
        System.out.println("s1 is empty : "+s1.isEmpty());
        System.out.println("s3 is empty : "+s3.isEmpty());
        System.out.println("s4 is empty : "+s4.isEmpty());
        
        //String trim()
        System.out.println("\nString trim() : \n");
        String s5="  Deepak ";
        System.out.println("Trim() ' Deepak ': "+s5.trim());
        
        //equalsIgnoreCase()
        System.out.println("\nequalsIgnoreCase() : \n");
        String s6="Deepak";
        String s7="deepak";
        System.out.println("s6.equalsIgnoreCase(s7) : "+s6.equalsIgnoreCase(s7));

        //int compare(Object o)
        System.out.println("\nint compare(Object o) : \n");
        String s8="a";//97
        String s9="A";//65
        System.out.println("a compareTo(A) : "+s8.compareTo(s9));//32
        System.out.println("A compareTo(a) : "+s9.compareTo(s8));//-32
        System.out.println("a compareTo(a) : "+s8.compareTo(s8));//32

        //int compareToIgnoreCase(Object o)
        System.out.println("\nint compareToIgnoreCase(Object o) :");
        System.out.println("a compareToIgnoreCase(A) : "+s8.compareToIgnoreCase(s9));//0

        //String concat(String s)
        System.out.println("\nString concat(String s) :\n");
        String s10="Deepak";
        String s11=" Java";
        System.out.println("concat() : "+s10.concat(s11));

        //by + operator
        System.out.println("\nby + operator :\n");
        System.out.println("+ operator : "+s10+s11);

        //static join(delimetr,elements)
        System.out.println("\nstatic join(delimetr,elements) :\n");
        String str1 ="Deepak";
        String str2 ="Java";
        String str3=null;
        System.out.println("join() method : "+String.join(",", str1,str2));//Deepak,Java
        System.out.println(String.join(";",str1,s3));//Deepak;

        //subSequence(int beginindex,int endindex)
        System.out.println("\nsubSequence(int beginindex,int endindex) :\n");
        String str="Deepak java";
        System.out.println("subSequence(Deepak java : 2,8) : "+str.subSequence(2, 8));//epak j

        //substring(int beginindex,int endindex) & substring(int beginindex)
        System.out.println("\nsubstring(int beginindex,int endindex) & substring(int beginindex) :\n");
        System.out.println("substring(int beginindex,int endindex) : "+str.substring(3, 10));//pak jav
        System.out.println("substring(int beginindex) : "+str.substring(8));//ava

        //replace(char oldChar,char newChar)
        System.out.println("\nreplace(char oldChar,char newChar) :\n");
        String q="this is demo";
        System.out.println(q.replace("is", "was"));//thwas was demo

        System.out.println("\nreplaceFirst(String regex,String replacement) :");
        System.out.println(q.replaceFirst("is", "was"));//thwas is demo

        System.out.println("\nreplaceAll(String regex,String replacement) :");
        System.out.println(q.replaceAll("is", "was"));//thwas was demo
        System.out.println(q.replaceAll("is(.)", "was"));//thwaswasdemo
        System.out.println(q.replaceAll("is(.*)", "was"));//thwas

        System.out.println("\n int indexOf(char c or String s) :");
        String w="deepak";
        System.out.println("indexOf('e') : "+w.indexOf('e'));//1
        System.out.println("indexOf('ep') : "+w.indexOf("ep"));//2

        System.out.println("\nint lastIndexOf(char c) :");
        System.out.println("lastIndexOf('e') : "+w.lastIndexOf('e'));//2

        System.out.println("\ncontains(char c) : ");
        System.out.println("contains('ep') :"+w.contains("ep"));//true

        System.out.println("\nstartsWith(char c) :");
        System.out.println("startsWith('d') : "+w.startsWith("d"));//true

        System.out.println("\nendsWith(char c) :");
        System.out.println("endsWith('k') : "+w.endsWith("k"));//true

        System.out.println("\ntoUpperCase() :");
        System.out.println(w.toUpperCase());//DEEPAK

        System.out.println("\ntoLowerCase() :");
        System.out.println(w.toLowerCase());//deepak

        System.out.println("\nvalueOf() :");
        int a=10;
        String x=String.valueOf(a);
        System.out.println(x);//10

        System.out.println("\ntoCharAarry :");
        char [] c=w.toCharArray();
        System.out.println(c);//deepak

        




    }
}
