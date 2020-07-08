package assignment1;

import java.util.Scanner;

public class Task13 {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int a,b,c,d,e;
        
        System.out.println("Enter 5 numbers : ");
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        
        if(a%2==0)
        {
            System.out.println("First number is even");
        }
        else
        {
            System.out.println("First number is odd");
        }
        
        
        if(b%2==0)
        {
            System.out.println("Second number is even");
        }
        else
        {
            System.out.println("Second number is odd");
        }
        
        if(c%2==0)
        {
            System.out.println("Third number is even");
        }
        else
        {
            System.out.println("Third number is odd");
        }
        
        if(d%2==0)
        {
            System.out.println("Fourth number is even");
        }
        else
        {
            System.out.println("Fourth number is odd");
        }
        
        if(e%2==0)
        {
            System.out.println("Fifth number is even");
        }
        else
        {
            System.out.println("Fifth number is odd");
        }
    }
    
}
