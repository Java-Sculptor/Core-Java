package NestedClass;

public class Argument {
    public static void main(String[] args) {
        //anonymous inner class in constructor argument
        Thread t=new Thread(new Runnable(){
            public void run()
            {
                System.out.println("constructor argument");
            }
        });
        t.start();
        System.out.println("main thread");
    }
}
