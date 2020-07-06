package assignment1;

import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        float radius;
        
        System.out.print("Enter Radius : ");
        radius = input.nextFloat();
        
        System.out.println("Circumference : "+(2*3.1416*radius));
        System.out.println("Area : "+(3.1416*radius*radius));
        
        
        
        
        
    }
    
}
