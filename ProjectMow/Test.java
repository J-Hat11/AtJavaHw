import java.util.Scanner;

import Mow.Mower;
import Mow.Yard;

public class Test {
   
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
  public static void delay(long mseconds) {
       try {
           Thread.sleep(mseconds);
       } catch (InterruptedException e) {
           System.err.println("InterruptedException received!");
       }
   }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        clearScreen();

        System.out.println("Enter height of yard: ");
        int height = scanner.nextInt();
        System.out.println("Enter width of yard: ");
        int width = scanner.nextInt();
        System.out.println();

        Yard yard = new Yard(height, width);
        Mower mower = new Mower(1,1,1);
        mower.Randomizer(yard);

        while (mower.getColumn()< yard.getWidth()){
clearScreen();
mower.cut(yard);
yard.printYard(mower);
delay(500);
mower.moveForward();
        }
        mower.cut(yard);
        boolean mowing = true;
        while(mowing){
clearScreen();
mower.cut(yard);
yard.printYard(mower);
delay(500);
mowing = mower.updateMower(yard);
        }


        clearScreen();
        mower.cut(yard);
        yard.printYard(mower);
        System.out.println("Mowing finished");

    }

    
}
