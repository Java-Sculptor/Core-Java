package JDK8;

import java.util.function.Consumer;

class Movie
{
    String name;
    Movie(String name)
    {
        this.name=name;
    }
}

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer <Movie> c1=m->System.out.println(m.name+" ready to release");
        Consumer <Movie> c2=m->System.out.println(m.name+" flop movie");
        Consumer <Movie> c3=m->System.out.println(m.name+" hit movie");
        Consumer <Movie> cc=c1.andThen(c2).andThen(c3);
        Movie m=new Movie("Animal");
        cc.accept(m);
    }
}
