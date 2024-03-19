package Basics.Control_Struct.Pattern;

public class ptn1_23 {
    public static void main(String []args){
        for(int i=1,k=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }

    }
}
