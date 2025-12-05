import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String or Phrase: ");
        if (scanner.hasNextLine()) {
        String input = scanner.nextLine().toLowerCase();
        

        String reverse = ""; 
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
            if (input.equals(reverse)) {
                System.out.println("The input is a palindrome.");
            } else { 
                System.out.println("The input is not a palindrome.");
            }
          
        }
    }

}