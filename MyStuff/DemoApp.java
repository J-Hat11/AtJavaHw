import MYSTUFF.Random;
public class DemoApp {
public static void main(String[] args) {
    System.out.println("Here are 5 randomly generated nymbers from 1-100: ");
    for(int i =0; i<5; i++){
        System.out.println(" "+ Random.getRandomInteger(100));
    }
    System.out.println("goodbye");
}
}
