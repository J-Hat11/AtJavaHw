import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter a 'C' for Celsius or 'F' for Fahrenheit: ");
        String Unit = scanner.next();

        double TempCelcius =0;

        if (Unit.equals("F")) {
            TempCelcius = (temperature-32) * 5 / 9;
        } else if (Unit.equals("C")) {
            TempCelcius = temperature;
        } else{
            System.out.print("Unit is Invalid"); 
        }

        String State; 
        if (TempCelcius <= 0) {
            State = "Solid state";
        } else if (TempCelcius >= 100) {
            State = "Gaseous state";
        } else {
            State = "Liquid state";
        }

        System.out.printf("At %.2f Degrees water is in a %s%n" , TempCelcius , State);





    }
}
