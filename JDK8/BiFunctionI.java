package JDK8;

import java.util.ArrayList;
import java.util.function.BiFunction;

class employee
{
    int id;
    String name;
    public employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
public class BiFunctionI {
    public static void main(String[] args) {
        ArrayList <employee> l=new ArrayList<employee>();
        BiFunction<Integer,String,employee> f=(id,name)->new employee(id, name);
        l.add(f.apply(100,"deep"));
        l.add(f.apply(101,"adi"));
        l.add(f.apply(103,"sunny"));

        for(employee e:l)
        {
            System.out.println("Emp id : "+e.id);
            System.out.println("Name : "+e.name);
        }


    }
}
