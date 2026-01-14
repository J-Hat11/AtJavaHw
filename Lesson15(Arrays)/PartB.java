import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int max = 20; 
        int current = 0; 

        int[] values = new int[max];

        System.out.println("Enter 20 Integers or q to quit: ");
         for(int i =0; i<max; i++){
            if (scanner.hasNextInt()) {
                values [i] = scanner.nextInt();
                current++;
                System.out.println("Enter another integer: ");
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
        for(int i =0; i<current; i++){
            System.out.print(values[i]+ ",");
        }
        System.out.println("Enter a target integer value: ");
        int target = scanner.nextInt();

        int xtimes = 0;
        for(int i =0; i<current; i++){
            if(values[i]==target){
                xtimes++;
            }
    }
       System.out.print("Target value appears: "+xtimes +1 + "times");
}
}