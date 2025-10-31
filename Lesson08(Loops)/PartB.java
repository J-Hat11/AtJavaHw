
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your intrest rate (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("What is your initial investment ($): ");
        double initial = scanner.nextDouble();

        double intrestamount = interestRate / 100;
        double total = initial;


        System.out.println("Year | Int Earned | Total Amount");

        for (int year = 1; year <=5 ; year++) {
          double intEarned = total * intrestamount;
           total = total + intEarned;
            System.out.printf(" %4d | %11.2f | %12.2f%n ", year , intEarned , total);
        }




    }
}
