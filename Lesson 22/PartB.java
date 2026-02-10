import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
     public static void main(String[] args) throws FileNotFoundException {
       
        String Filename = "birthyears.txt";
    
                File inputFile = new File(Filename);
                Scanner in = new Scanner(inputFile);
        
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    Scanner lineScanner = new Scanner(line);
                    lineScanner.useDelimiter(",");

                    String name = lineScanner.next();
                    String Stringyear = lineScanner.next();
            
                try {
                    int year = Integer.parseInt(Stringyear);
                    System.out.println(name + " was born in " + year);
                } catch(NumberFormatException e) {
                    System.out.println("I do not know what year " + name + " was born");

                }
                
                 lineScanner.close();

        } 
        in.close();
       
        }
    }




