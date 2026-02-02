import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class partB {
    public static void main(String[] args) throws FileNotFoundException{
    File inputFile = new File("characters.txt");
    Scanner in = new Scanner(inputFile);

    int letters =0; 
    int digits =0;
    int count =0;

       in.useDelimiter("");
       while (in.hasNext()) {
           char c = in.next().charAt(0);
           System.out.print(c);
           count++;

           if (Character.isLetter(c)) {
             letters ++;
           }
             if (Character.isDigit(c)) {
             digits ++;


    }
    }
in.close();
System.out.println ();
System.out.println("Count: "+ count );
System.out.println("Letters: "+ letters );
System.out.println("Digits: "+ digits );

//note only getting 79 characters for some reason

}
}