package NestedClass;
import java.awt.*;
import java.awt.event.*;
public class JarDemo {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame();
		f.addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
					for(int i=1;i<=10;i++)
					{
						System.out.println("I am closing window :"+i);
						System.exit(0);
					}
				}
				});
		f.add(new Label("I can Create Executable Jar File!!!"));
		f.setSize(500,500);
		f.setVisible(true);
		
	}

}
