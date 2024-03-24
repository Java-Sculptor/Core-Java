package Inheritance;

class Car {
	public Car() 
	{
		System.out.println("Car");
	}
	public void vehicalType() {
		System.out.println("Vehical : car");
	}
}

class Maruti extends Car {
	public Maruti()
	{
		System.out.println("Maruti");
	}
	public void brand() {
		System.out.println("Brand");
	}
	public void speed() {
		System.out.println("90Kmph");
	}
}

class BMW extends Car {
	public BMW()
	{
		System.out.println("BmW");
	}
	public void engine() {
		System.out.println("4stroke");
	}
}

public class Hierarchical {
    public static void main(String [] args) {
		System.out.println("Subclass Maruti");
		Maruti m=new Maruti();
		m.vehicalType();
		m.brand();
		m.speed();
		
		System.out.println("Subclass BMW");
		BMW b=new BMW();
		b.vehicalType();
		b.engine();
  
}
}