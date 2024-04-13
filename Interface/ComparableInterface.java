package Interface;

import java.util.ArrayList;
import java.util.Collections;

class Employee
{
    int i;
    String s;
    public Employee(int i, String s) {
        this.i = i;
        this.s = s;
    }
    @Override
    public String toString() {
        return  i + ":" + s ;
    }

    
}
public class ComparableInterface {
    
    public static void main(String[] args) {
        ArrayList <Employee> l=new ArrayList<Employee>();
        l.add(new Employee(105, "deep"));
        l.add(new Employee(456, "advait"));
        l.add(new Employee(8936, "sunny"));
        l.add(new Employee(6579, "bunny"));
        System.out.println(l);

        //alphabetical order
        Collections.sort(l,(e1,e2)->e1.s.compareTo(e2.s));
        System.out.println(l);
    }
}
