package Strings;

class Developer
{
    int id;
    String name;
    public Developer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Developer [id=" + id + ", name=" + name + "]";
    }       
}

public class ToStringDemo {
    public static void main(String[] args) {
        
        Developer d=new Developer(165, "Deepak");
        System.out.println(d);
    } 
}
