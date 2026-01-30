import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Parta {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);

        ArrayList<Integer> temps = new ArrayList<>();
        int lowestVal = Integer.MAX_VALUE;
          while (in.hasNext()) {
            int temp = in.nextInt();
            temps.add(temp); //recieved help with this part from classmates //add val from file to arraylist

            if (temp < lowestVal){
                lowestVal = temp;

            }
            }
              for (int temp : temps){
                if(temp == lowestVal){
                    System.out.println(temp +"<= lowest");
                } else{
                    System.out.println(temp);
                }
              

        }
        in.close();

        
}
} 