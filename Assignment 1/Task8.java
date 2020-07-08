package assignment1;

import java.util.Scanner;


public class Task8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1;
        
        System.out.print("Enter a numbers : ");
        
        num1 = input.nextInt();
        
        
        if(num1 % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
    
}
