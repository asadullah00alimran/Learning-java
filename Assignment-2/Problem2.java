
package assignment2;

import java.util.Scanner;

public class Problem2 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n,r;
        
        System.out.println("No. of row :");
        n = input.nextInt();
        
        System.out.println("No.of stars in a row :");
        r = input.nextInt();
        
        for(int i=1;i<=n;i++){
            
           for(int j=1;j<=r;j++){
               
                System.out.print("*");
           }
           System.out.println();
            
        }
        
    }
    
}
