package JDK8;

@FunctionalInterface
interface Intra
{
    //public  void m1();
    //public void m2(int a,int b);
    //public int getLength(String s);
    public int squareIt(int x);
}
public class FuncILE {
    public static void main(String[] args) {

        //Intra i1=()-> System.out.println("hello");
        //i1.m1();//hello

        //Intra i2=(a,b)->System.out.println(a+b);
        // i2.m2(10, 20);//30
       
        // Intra i3=s->s.length();
        // System.out.println(i3.getLength("deepak"));//6

        Intra i4=x->x*x;
        System.out.println(i4.squareIt(4));//16
    }
}
