import java.util.ArrayList;
import java.util.Scanner;

public class Partb {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> values = new ArrayList<Double>();
    
    while(true){
        System.out.print("Enter Test Scores or q to quit: ");
        String input = scanner.next();
        if (input.equalsIgnoreCase("q")) {
            break;
        }
        //need to caste string to double had to look this up
        double Score = Double.parseDouble(input);
        values.add(Score);
        }
    
        double total =0;


           for(int i=0; i<values.size(); i++){
    System.out.printf("%.2f%n", values.get(i));   
    total += values.get(i);
    }
    
    double average = total/values.size();
    System.out.println("Average: "+ average);

        
}
}