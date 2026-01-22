import java.util.ArrayList;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
    ArrayList<Integer> values = new ArrayList<Integer>();
     Scanner scanner = new Scanner(System.in);

     while(true){
        System.out.print("Enter Integer Temperature values or q to quit: ");
        String input = scanner.next();
        if (input.equalsIgnoreCase("q")) {
            break;
        }
        int nums = Integer.parseInt(input);
        values.add(nums);
    }
//looked up help on the interned because n%2 !=0 was not working
    values.removeIf(n->n%2 !=0);
    System.out.print("Modified Array: ");
    System.out.println();
    for(int i=0; i<values.size(); i++){
    System.out.println(values.get(i));

}

    }}