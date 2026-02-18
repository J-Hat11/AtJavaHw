import java.util.Scanner;

public class PartB {

    static class counter{
    private int count = 0;

   public int getValue() {
       return count;
   }
  
   public void count() {
       count = count + 1;
   }

   public void reset() {
       count = 0;
   }
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        counter CakeCounter = new counter();
        counter PieCounter = new counter();

        
        while(true){
           System.out.print("Enter a 'c' for cake 'p' for pie or 'q' to quit: ");
           String input = scanner.next();
           if(input.equalsIgnoreCase("q")){
            break;
           } else if (input.equalsIgnoreCase("c")){
            CakeCounter.count();
           }else if (input.equalsIgnoreCase("p")){
            PieCounter.count();
           } else{
            System.out.println("Invalid input");
           }

        }

        System.out.println();

        System.out.println("Cake Votes: " + CakeCounter.getValue());
        System.out.println("Pie Votes: " + PieCounter.getValue());
    }

}



