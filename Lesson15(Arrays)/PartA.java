import java.util.Arrays;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 10; 
        int current = 0; 

        int[] values = new int[max];

        System.out.println("Enter 10 Integers: ");

        for(int i =0; i<max; i++){
            if (scanner.hasNextInt()) {
                values [i] = scanner.nextInt();
                current++;
            } else {
            String input = scanner.next();
            if(scanner.hasNext("q") || scanner.hasNext("Q")){ //I cant figure out why its making me enter q twice to quit the prorgam
                scanner.next(); 
                break;
            } else{
                System.out.println("Invalid input");
            }
        } 
        }

        System.out.print("*");
        for(int i =0; i<current; i++){
            System.out.print(values[i]+ "*");
        }

        System.out.println();

        Arrays.sort(values, 0, current);

       //used internet for this part. 
        for(int i = current-1; i>=0; i--){
            System.out.print(values[i]+",");
        }
    }}


        
    

