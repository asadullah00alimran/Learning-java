package assignment1;

import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1,num2;
        
        System.out.print("Enter the 1st number : ");
        num1 = input.nextInt();
        
        System.out.print("Enter the 2nd number : ");
        num2 = input.nextInt();
        
        System.out.println("Sum :"+(num1+num2));
        System.out.println("Product :"+num1*num2);
        System.out.println("Difference :"+(num1-num2));
        
        
        
        
        
    }
    
}
