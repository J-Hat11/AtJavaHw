import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
     ArrayList<Integer> values = new ArrayList<Integer>();
     Scanner scanner = new Scanner(System.in);

     while(true){
        System.out.print("Enter Integer Temperature values or q to quit: ");
        String input = scanner.next();
        if (input.equalsIgnoreCase("q")) {
            break;
        }
        int temps = Integer.parseInt(input);
        values.add(temps);
    }

    int lowest = values.get(0);
    for(int temps : values ){
        if (temps<lowest){
            lowest = temps;
        }
    }
for(int i=0; i<values.size(); i++){
    System.out.print(values.get(i));
if (values.get(i)==lowest){
      System.out.print("<= lowest");
}
System.out.println();
}






}








}
