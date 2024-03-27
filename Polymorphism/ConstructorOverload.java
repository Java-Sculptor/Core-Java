package Polymorphism;

public class ConstructorOverload {
   
	 void ConstructorOverload()
	{
		int s=10,c;
		c=s*s;
		System.out.println("Area of Square = "+c);
	}
	 
	 int ConstructorOverload(int l,int b)
	 {
		 int c=l*b;
		 return c;
	 }
	 
	 double ConstructorOverload(double r)
	 {
		 double a=3.14*r*r;
		 return a;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverload m=new ConstructorOverload();
		System.out.println("Area of circle = "+m.ConstructorOverload(2.4));
		System.out.println("Area of rectangle = "+m.ConstructorOverload(20,4));
		m.ConstructorOverload();
	}

}


