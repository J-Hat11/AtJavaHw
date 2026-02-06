import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
public static void main(String[] args) throws FileNotFoundException {

File inputFile = new File("sales_by_cat.txt");
Scanner in = new Scanner(inputFile);

          while (in.hasNextLine()) {
    String line = in.nextLine();
    Scanner lineScanner = new Scanner(line);
    lineScanner.useDelimiter("[,\n]+");
    String dept = lineScanner.next();
    String manager = lineScanner.next();
    double expense;

    String nextWord = lineScanner.next().trim();
    if (nextWord.equalsIgnoreCase("n/a")) {
        expense = 0.0;
    } else {
         expense = Double.parseDouble(nextWord); //kept getting 0 in my loops so i had use internet to help //the loop via slideshow
    }
    System.out.printf("%-17s | %-10s | $%10.2f%n", dept, manager, expense);
    lineScanner.close();
}
in.close();
    }
 
        
}
   

