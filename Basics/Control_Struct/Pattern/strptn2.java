/*
    *
   **
  ***
 ****
*****   
 */


package Basics.Control_Struct.Pattern;

public class strptn2 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++)
         {
            // Print spaces
            for (int j = 1; j <= 5 - i; j++) 
            {
                System.out.print(" ");
            }
             // Print stars
            for (int k = 1; k <=i; k++) 
            {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }
    
}
