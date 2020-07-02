
package assignment2;

import java.util.Scanner;

public class Problem5 {
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows :");

        int rows = scanner.nextInt();
        
        
        for (int i=1; i<=rows; i++) 
        { 
            // Print space in decreasing order 
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    

