package assignment1;

import java.util.Scanner;

public class Task5 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1,num2;
        
        System.out.print("Enter two numbers : ");
        
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        if(num1>num2)
        {
            System.out.println("first is greater");
        }
        else
        {
            System.out.println("first is not greater");
        }
    }
}
