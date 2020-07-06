package assignment2;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n,row,colum;
        
        System.out.println("Enter the number of row :");
        n = input.nextInt();
        
        for(row=1;row<=n;row++)
        {
            for(colum=1;colum<=n-row;colum++)
            {
                System.out.print(" ");
            }
             for(colum=1;colum<=row*2-1;colum++)
                {
                    System.out.print("*");
                }
                System.out.println();
        }
                
        for(row=n-1;row>=1;row--)
        {
            for(colum=1;colum<=n-row;colum++)
            {
                System.out.print(" ");
            }
             for(colum=1;colum<=row*2-1;colum++)
                {
                    System.out.print("*");
                }
                System.out.println();
        }
     
     
    }
    
}
