package JDK8;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer,Integer> f=i->i*i;
        System.out.println(f.apply(4));
        
    }
}
