package assignment1;

import java.util.Scanner;

public class Task11 {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 5 numbers : ");
        
        int num[]=new int[5];
        int i,sum=0;
        
        for(i=0;i<=4;i++)
        {
            num[i]=input.nextInt();
            
            sum = sum + num[i];
        }
        System.out.println("Average : "+(sum/5));
        
        
    }
    
}
