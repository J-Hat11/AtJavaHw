import java.util.Scanner;

public class partC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int sum = 0;
        System.out.println("Generating 10 random integers between 1 and 100:");
        for (int i = 0; i < 1000; i++) {
            int randomNum = (int)(Math.random() * 10) + 1;
            System.out.println(randomNum);
            sum += randomNum;
    }
        double average = sum / 1000.0;
        System.out.printf("The average of the generated numbers is: %.2f%n", average);
        //Yes this avergae of 5.61 makes sense because the larger the sample size the closer the average will be to 5
}
}