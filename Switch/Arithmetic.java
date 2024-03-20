package Switch;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter any 2 numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Enter an symbol:\nAdd(+)\nSub(-)\nMul(*)\nDiv(/)\nMod(%)");
        char c=sc.next().charAt(0);
        switch (c) {
                case '+':
                System.out.println(x+" + "+y+" = "+(x+y));
                break;
                case '-':
                System.out.println(x+" - "+y+" = "+(x-y));
                break;
                case '*':
                System.out.println(x+" * "+y+" = "+(x*y));
                break;
                case '/':
                System.out.println(x+" / "+y+" = "+(x/y));
                break;
                case '%':
                System.out.println(x+" % "+y+" = "+(x%y));
                break;
            default:
            System.out.println("Invalild choice......");
        }


    }
    
}
