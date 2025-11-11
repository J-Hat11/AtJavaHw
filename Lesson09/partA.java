import java.util.Scanner;

public class partA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter test scores one by one. Enter a negative number to finish:");
        
        double sum = 0;
        int count = 0;
       
        while (true) {
            double score = scanner.nextDouble();
            if (score < 0) {
                break;

            }
            sum += score;
            count++;

        }
            
        if (count > 0) {
            double average = sum / count;
            System.out.println("Total number of scores entered: " + count);
            System.out.printf("The average score is: %.2f%n", average);
        
    

        
    

    }
}
}