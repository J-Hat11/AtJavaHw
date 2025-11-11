import java.util.Scanner;

public class partB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();
        int eCount = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'e' || phrase.charAt(i) == 'E') {
                eCount++;
            }
        }
        System.out.println("The letter 'e' appears " + eCount + " times in the phrase.");

    }
}
