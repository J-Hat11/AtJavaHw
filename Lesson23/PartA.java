import java.util.Scanner;

public class PartA {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       try {
           int quizScore = quizScore(in);
           System.out.println("score = " + quizScore);
       } catch (Exception e) {
           System.err.println("an error occurred!");
           System.out.println(e.getMessage());
       }
}

public static int quizScore(Scanner in) {
    
       System.out.print("Enter a quiz scores 0-100 or 'q' to quit: ");

        String input = in.next();
        int score = Integer.parseInt(input);
        
        if(score<0 || score>100){
            throw new NumberFormatException("Score is invalid.");
        }
        return score;
    }}
    