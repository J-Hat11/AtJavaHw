import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 20: ");
        int value = scanner.nextInt();
        int percent = (value * 100) / 20;

        System.out.print("Progress Bar: [");

        for (int i = 0 ; i < 20; i++){
          if (i < value) {
          System.out.print("#");
        } else {
          System.out.print("-"); //used ai to troubleshoot why remaining dashes werent printing //was because i had i<value not 20 so the other part was out of bounds
        }
        }

        System.out.print("] -> " + percent + "%");





    }
}


