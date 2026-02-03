import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        int count =0;
        double sum = 0; 
        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter a quiz score or 'q' to quit: ");
            if(scanner.hasNext("q")){
                break;  
        } else {
              double val = scanner.nextDouble();
             list.add(val);
             count++;
             sum = sum+val;
        }
    }
    double avg = sum/count;
    System.out.println("------------------------------");
    for(int i=0; i<list.size(); i++){
        System.out.printf("  %7.2f %n", list.get(i));
    }
   
    System.out.println("------------------------------");
    System.out.println("avg = " + avg);





}
}
    
    
