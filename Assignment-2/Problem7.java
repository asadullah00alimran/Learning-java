
package assignment2;

import java.util.Scanner;


public class Problem7 {
    
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      
      int row,colum,r,c;
      
        System.out.println("Enter the number of row :");
        r=input.nextInt();
        System.out.println("Enter the number of colum : ");
        c=input.nextInt();
        
        for(row=1;row<=r;row++)
        {
            for(colum=1;colum<=c;colum++)
            {
             if(row == 1 || row == r || colum == 1 || colum == c) 
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
