
package assignment3;

import java.util.Scanner;


public class DeclarClass {
    
    String name;
    String sub;
    int id;
    
    
    void inputData(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name : ");
        name = input.nextLine();
        System.out.println("Enter Subject :");
        sub = input.nextLine();
        System.out.println("Enter ID :");
        id = input.nextInt();
        
        
       
    }
    
    void printData(){
        
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Subject : "+sub);
    }
    
}
