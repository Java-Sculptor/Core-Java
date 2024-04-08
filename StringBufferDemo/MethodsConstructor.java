package StringBufferDemo;

public class MethodsConstructor {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();//zero parameterized constructor
        
        //capacity()
        System.out.println("Capacity of StringBuffer() : "+sb.capacity());//16

        StringBuffer sb1=new StringBuffer("deepak");//String constructor
        System.out.println("Capacity of StringBuffer(String str) :"+sb1.capacity());//16+length(6)=22

        StringBuffer sb2=new StringBuffer(1000);
        System.out.println("StringBuffer(int size) : "+sb2.capacity());

        //append()
        sb.append("deepak java");
        System.out.println("Capacity(sb.append('deepak java')) : "+sb.capacity());//16

        sb.append("deepak javaa");
        System.out.println("Capacity(sb.append('deepak javaa')) : "+sb.capacity());//(oldcapacity+1)*2=34

        //length()
        System.out.println("length('deepak') :"+sb1.length());//6

        //delete(int beginIndex,int endIndex)
        System.out.println("delete(deepak : 2,5) : "+sb1.delete(2, 5));//dek

        //deleteCharAt(int i)
        StringBuffer sb3=new StringBuffer("deepak");
        System.out.println("deleteCharAt('deepak' :3) : "+sb3.deleteCharAt(3));//deeak

        //equals
        StringBuffer sb4=new StringBuffer("deepak");
        System.out.println("equals() : "+sb3.equals(sb4));//false
        StringBuffer sb5=sb4.append("hii");
        System.out.println(sb4.equals(sb5));//true

        //insert()
        StringBuffer sb6=new StringBuffer("deepak java");
        System.out.println(sb6.insert(3, "zzz"));//deezzzpak java

        //replace
        StringBuffer sb7=new StringBuffer("deepak java");
        System.out.println(sb7.replace(3, 6, "m"));//deem java

        //reverse
        StringBuffer sb8=new StringBuffer("deepak java");
        System.out.println(sb8.reverse());//avaj kapeed

        //ensureCapacity()
        StringBuffer sb9=new StringBuffer();
        sb9.ensureCapacity(100);
        System.out.println(sb9.capacity());//100

        //setCharAt(int index,char)
        StringBuffer sb10=new StringBuffer("deepak");
        sb10.setCharAt(4, 'c');
        System.out.println(sb10);//deepck

        //setLength()
        sb10.setLength(4);
        System.out.println(sb10);//deep

        //trimToSize()
        StringBuffer s=new StringBuffer();
        s.append("hii");
        s.ensureCapacity(100);
        s.trimToSize();
        System.out.println(s.capacity());//3
    }
}
