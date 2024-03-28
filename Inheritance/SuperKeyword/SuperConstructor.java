package Inheritance.SuperKeyword;
class Aa {
    Aa(int a) {
        System.out.println(a);
    }
}

class Bb extends Aa {
    Bb() {
        super(100);
        System.out.println("hello");
        
    }
}
public class SuperConstructor {
    public static void main(String[] args) {
        Bb b=new Bb();
    }
    
}
