import java.util.Scanner;
public class PartB {
    enum AgeType {
        CHILD, ADULT, SENIOR }

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


System.out.print("Is it monday? (y/n)" );
String monday = scanner.nextLine();

System.out.print("Enter Age: ");
int age = scanner.nextInt();

System.out.print("Enter meal cost ($): ");
double cost = scanner.nextDouble();

double Discount = 0.00;

AgeType Type;
    if (age<13) {
        Type = AgeType.CHILD;
    } else if (age>=50) {
       Type = AgeType.SENIOR;
    } else { 
        Type = AgeType.ADULT;
    } 


if (monday.equals("y")) {
    switch (Type){
    case CHILD -> Discount = 0.075;
    case ADULT -> Discount = 0.05;
    case SENIOR -> Discount = 0.15;
    }
} else { 
    switch (Type){
    case CHILD -> Discount = 0.05;
    case SENIOR -> Discount = 0.075;
    case ADULT -> Discount = 0.00;
}}
double Discount_Total = cost * Discount;
double T_Cost = cost - Discount_Total;
System.out.printf("Total cost of meal is ($) " + T_Cost);


}
}

    
