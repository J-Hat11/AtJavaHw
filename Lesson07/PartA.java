import java.util.Scanner;

public class PartA {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Is it monday? (y/n)" );
String monday = scanner.nextLine();

System.out.print("Enter Age: ");
int age = scanner.nextInt();

System.out.print("Enter meal cost ($): ");
double cost = scanner.nextDouble();

double Discount = 0.00;

if (monday.equals("y")) {
    if (age<13) {
        Discount = 0.075;
    } else if (age>=50) {
        Discount = 0.15;
    } else { 
        Discount = 0.05;
    } 
} else { 
    if (age<13) {
        Discount = 0.05;
    } else if (age>=50) {
        Discount = 0.075;
    } else {
        Discount = 0.00;
    }
}
double Discount_Total = cost * Discount;
double T_Cost = cost - Discount_Total;


System.out.printf("Total cost of meal is ($) " + T_Cost);

}
}
