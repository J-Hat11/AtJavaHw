import java.util.Arrays;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter a String; ");
     String strgn1 = scanner.next();

     System.out.print("Enter a String: ");
     String strgn2 = scanner.next();

     System.out.print("Enter a String: ");
     String strgn3 = scanner.next();

     String[] A = {strgn1, strgn2, strgn3};
     Arrays.sort(A);

     for (String word : A) {
        System.out.println(word);
     }








    }
}
