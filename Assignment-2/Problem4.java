
package assignment2;

import java.util.Scanner;

public class Problem4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int rows;
        
        System.out.println("Enter the number of rows :");

        rows = input.nextInt();
        
        
        for (int i=1; i<=rows; i++) 
        { 
            
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
           
            for (int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
    

