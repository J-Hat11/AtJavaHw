import java.util.ArrayList;
import java.util.Scanner;

public class Parta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String input;

        while(true){
        System.out.print("Enter names or # to quit: ");
        input = scanner.next();
        if (input.equals ("#")) {
            break;
        }
        names.add(input);
        }
        
        for(int i=0; i<names.size(); i++){
    System.out.println(names.get(i));   
    }
        }
        
  
}
