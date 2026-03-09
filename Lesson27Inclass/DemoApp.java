

import mystuff.Random;

public class DemoApp {
    public static void main(String[] args) {
    System.out.println("5 Randomly generated numbers from 1-100: ");
    for (int i =0; i<5; i++){
        System.out.println(" " + Random.getRandomInteger(100));
    }
    System.out.println("goodbye");
    
}
}
