package JDK8;

import java.util.function.Consumer;

public class ConsumerI {
    public static void main(String[] args) {
        Consumer<String> c=s->System.out.println(s);
        c.accept("Deepak");
        c.accept("Advait");
    }
}
