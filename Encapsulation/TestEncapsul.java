package Encapsulation;
class Employee {
    private int id;
    private String name;
    public void setId(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
public class TestEncapsul {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setId(16);
        e.setName("Advait");
       System.out.println("Id : "+e.getId()+" Name : "+e.getName());
    }
}
