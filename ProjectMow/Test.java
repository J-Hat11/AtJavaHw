import java.util.Scanner;
import Mow.Yard;

public class Test {
   
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        clearScreen();

        System.out.println("Enter height of yard: ");
        int height = scanner.nextInt();
        System.out.println("Enter width of yard: ");
        int width = scanner.nextInt();
        System.out.println();

        Yard yard = new Yard(height, width);
        yard.printYard();

        

    }

    
}
