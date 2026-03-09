import java.util.Scanner;

public class DieSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Die die = new Die();
        String choice = "";

        System.out.println("Enter 'r' to roll the die");
        System.out.println("Enter 'd' to display the die");
        System.out.println("Enter 'q' to quit");

        while(!choice.equals("q")){
            System.out.println();
            System.out.println("Enter your choice");
            choice = input.nextLine().toLowerCase();
            if(choice.equals("r")){
                die.roll();
                System.out.println("rolling...");
            } else if(choice.equals("d")){
                System.out.println("Current die face value: " + die.getValue());
                System.out.println(die.getASCIIArt());
            } else if (choice.equals("q")){
                System.out.println("Ending...");
            } else {
                System.out.println("Invalid input");
            }

        }
        input.close();
    }
}
