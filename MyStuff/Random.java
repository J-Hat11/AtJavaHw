package MYSTUFF;

public class Random {
    public static int getRandomInteger(Integer n) {
        int randomOutput = (int) (Math.random()*n)+1;
        return randomOutput;
    }
}
