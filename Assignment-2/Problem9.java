
package assignment2;

import java.util.Scanner;

public class Problem9 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
      
      int row,colum,r,c;
      
        System.out.println("Enter the number of row :");
        r=input.nextInt();
        
        
        for(row=1;row<=r;row++)
        {
            for(colum=1;colum<=r;colum++)
            {
             if(row == r || colum == r || colum == r ) 
             {
                 System.out.print("*");
             }
             else
             {
                 System.out.print(" ");
             }
            }
            System.out.println();
            
        }
      
    }
}
