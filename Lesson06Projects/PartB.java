import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        double num1 = scanner.nextDouble();
         System.out.print("Enter another floating point number: ");
        double num2 = scanner.nextDouble();

        double round1 = Math.round(num1*100)/100;
        double round2 = Math.round(num2*100)/100;

        if (round1 == round2) {
            System.out.print("Both numbers are equal to the first two decimal places");
        } else {
            System.out.print("The numbers are not equal");
        }




    }
}
