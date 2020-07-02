
package assignment2;

import java.util.Scanner;

public class Problem3 {
    
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.println("No.of row:");
        n = input.nextInt();
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
}
