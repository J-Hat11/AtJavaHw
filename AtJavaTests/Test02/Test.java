import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sideLength , sideLength2, sideLength3;
        
        
        System.out.print("Enter a Triangle side length: ");
        if(scanner.hasNextInt()) {
             sideLength = scanner.nextInt();
              if (sideLength <= 0) {
                System.out.println("Error: Side length must be a positive integer.");
                return; 
            }
        } else {
            System.out.println("Error: Invalid input. Please enter a positive integer.");
            return;
        }
        
         
        System.out.print("Enter another Triangle side length: ");
        if (scanner.hasNextInt()) {
             sideLength2 = scanner.nextInt();
            if(sideLength2 <= 0) {
                System.out.println("Error: Side length must be a positive integer.");
                return;
            }
        } else {
            System.out.println("Error: Invalid input. Please enter a positive integer.");
            return;
            
        }

        System.out.print("Enter the last Triangle side length: ");
        if (scanner.hasNextInt()) {
             sideLength3 = scanner.nextInt();
            if(sideLength3 <= 0) {
                System.out.println("Error: Side length must be a positive integer."); 
                return;
           } } else { 
                System.out.println("Error: Invalid input. Please enter a positive integer.");
                return;
            }

             if (sideLength + sideLength2 > sideLength3 &&
           sideLength + sideLength3 > sideLength2 &&
            sideLength2 + sideLength3 > sideLength) {
            System.out.println("The lengths can form a triangle.");
        } else {
           System.out.println("The lengths cannot form a triangle.");
            
        }

       
        
        if (sideLength == sideLength2 && sideLength2 == sideLength3) {
            System.out.println("The triangle is equilateral.");
        } else if (sideLength == sideLength2 || sideLength2 == sideLength3 || sideLength == sideLength3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
            
        }

       
                
    }
        
        

       


    }
