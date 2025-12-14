import java.util.Scanner;

public class PartA {
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your first name? ");
      String input = in.next();
      System.out.println("Hello, " + input);
      System.out.print("How old are you? ");
      /// int input = in.nextInt(); //The problem with this program is that the variable 'input' is declared twice so line 11 should have a different varibale for age:
      int age =in.nextInt();
     // input++; //now this should be age not input
     age++;
     // System.out.println("Next year, you will be " + input);//this should have age not input
      System.out.println("Next year, you will be " + age);
   }
}


        
    

