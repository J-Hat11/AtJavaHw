import java.util.Scanner;

public class clas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxTemp = Integer.MIN_VALUE;
        int minTemp = Integer.MAX_VALUE;

        do { 
            System.out.print("Enter a temperature reading (or 'q' to quit): ");
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp > maxTemp) {
                    maxTemp = temp; 

        }
                if (temp < minTemp) {
                    minTemp = temp;
                }
            } else if (scanner.hasNext() && scanner.next().equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        } while (true);
        if (maxTemp == Integer.MIN_VALUE && minTemp == Integer.MAX_VALUE) {
            System.out.println("No temperature readings were entered.");
        } else {
            System.out.println("Maximum temperature: " + maxTemp);
            System.out.println("Minimum temperature: " + minTemp);

    }
        
}}
