import java.util.Scanner;

public class extrra {
   
    public static double AVG (double a, double b){
        double val= a+b;
        val=val/2.0;
        return val;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        double number = scanner.nextDouble();
        System.out.print("Enter a Number: ");
         double number2 = scanner.nextDouble();
         double avg = AVG(number, number2);

}
}