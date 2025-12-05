import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            boolean isPrime = true;
            for (int i = 2; i<number; i++) {//loop to check for factors, starting at 2 because 1 is a factor of all integers
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }


    
}
}