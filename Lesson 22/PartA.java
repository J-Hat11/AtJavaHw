import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inKeyboard = new Scanner(System.in);
        boolean fileOpened = false;

        while (fileOpened == false) {
            System.out.println("Enter a file name or # to quit: ");
            String name = inKeyboard.nextLine();

            if(name.equals("#")){
                System.out.println("Goodbye");
                break;

            }

            try {
                File inputFile = new File(name);
                Scanner in = new Scanner(inputFile);
                while (in.hasNext()) {
                    String word = in.next();
                    System.out.println(word);
                }
                in.close();
                fileOpened = true;

            } catch (FileNotFoundException exception) {
                System.out.println("Error: unable to find the file named \"" + name + "\".");
                name = inKeyboard.nextLine();
            }
           
        }
         inKeyboard.close();
    }
}

