import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class partA {
    public static void main(String[] args) throws FileNotFoundException{
       File inputFile = new File("customerdata.txt");
       Scanner in = new Scanner(inputFile);
    
       System.out.println("-----------------------");
       System.out.println(" ID |  Name  | Balance");
       System.out.println("-----------------------");
       
       in.useDelimiter("[,\\s\\n]+"); //looked up debug needs double backslash
       
       while(in.hasNext()){
        int ID = in.nextInt();
        String Name = in.next();
        double Balance = in.nextDouble();
    
        System.out.printf("%06d | %10s | $%10.2f%n", ID, Name, Balance);
       }
      in.close();


       
    }




}

