package Basics;

public class Expression {
    public static void main(String[] args) {
        int x=1;
	  System.out.printf("%d%d%d\n",x,(x=x+2),(x<<2));
	  
	  x<<=2;
	  System.out.printf("%d%d%d\n",++x,x++,++x);
	      return;
	  
    }
    
}
