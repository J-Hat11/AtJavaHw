import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practical {
   public static void main(String[] args) {
    File inputFile = new File("mathmeet.txt");
    int count = 0;
    double avg=0;
    int total = 0; 
    System.out.println("Name      |         Schoool        | Score");
    System.out.println("-------------------------------------------------");
    try {
        Scanner in = new Scanner(inputFile);
        in.useDelimiter(",\n");

        while(in.hasNextLine()){
        String name = in.next();
        String School = in.next();
        String scoreString = in.next();

        System.out.print(name + "|" + School + "|" + scoreString  + "|");
        
        int score = Integer.parseInt(scoreString);
        
            count++;
            total += score;
            avg = total/count; 
        }
       System.out.println("Average" + avg);
        in.close();
    } catch(FileNotFoundException e){
        System.err.println("An Error has Occured: " + e.getMessage());
    }
   } 
}
