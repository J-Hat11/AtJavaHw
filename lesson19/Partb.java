import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Partb {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("quizzes.txt");
        Scanner in = new Scanner(inputFile);

        File output = new File("quizzesMod.txt");
        PrintWriter out = new PrintWriter(output);

        int sum =0; 
        int count =0; 

         while (in.hasNext()) {
            int score = in.nextInt();
            System.out.printf("Quiz# %03d: %d%n" , count+1 ,score);//used ai to help with formated output
            sum+=score;
            count++;

    }
    double average = sum/count;
    System.out.println("---------------");
    System.out.println("Average: " + average);


    in.close();
    out.close();

}
}
