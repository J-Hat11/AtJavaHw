package mystuff;

public class Random{
    public static int getRandomInteger(int n) {
        int val = (int)(Math.random()*n)+1;
        return val;
    }
}