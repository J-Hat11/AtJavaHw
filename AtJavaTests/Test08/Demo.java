import java.util.Scanner;
import org.derryfield.math.Algebra;
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 'x' value for the Harmonic Mean: ");
        double x = scanner.nextDouble();

        System.out.println("Enter a 'y' value for the Harmonic Mean: ");
        double y = scanner.nextDouble();

        Double result = Algebra.HarMean(x,y);
        System.out.println("Answer: " + result);
        
    }
}
