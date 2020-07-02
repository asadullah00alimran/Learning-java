
package assignment2;

import java.util.Scanner;

public class Problem1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.println("No.of stars :");
        n = input.nextInt();
        
        for(int i=0;i<=n;i++){
            
            System.out.print("*");
            
        }
        System.out.println();
    }
    
}
