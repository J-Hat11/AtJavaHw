import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 10000;
        int[] values = new int[max];
        Random rand = new Random();//searched this part up


        for(int i = 0; i < max; i++){
            values[i]=rand.nextInt(max)+1;
        }
        Arrays.sort(values);
        int targetValues = 10;
        for(int i=0; i<targetValues; i++){
            int targetValue = rand.nextInt(max)+1;
    
        //Used internet to look up binary and linear search time methods
        long StartTime = System.nanoTime();
        int LinearResult = linearSearch(values,targetValue);
        long LinearTime = System.nanoTime() - StartTime;

        StartTime = System.nanoTime();
        int BinaryResult = Arrays.binarySearch(values, targetValue);
        long BinaryTime = System.nanoTime() - StartTime;
        int occurences = linearSearch(values, targetValue);

        System.out.printf("Target Value: "+ targetValue);
        System.out.println();
        System.out.printf("Occurences: "+ occurences);
        System.out.println();
        System.out.printf("Linear Time: "+ LinearTime);
        System.out.println();
        System.out.printf("Binary Time: "+ BinaryTime);
        System.out.println();
        
        


        }
        
    }
     public static int linearSearch(int[] array, int targetValue){
 int xtimes = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]==targetValue){
                xtimes++;
            }
}
  return xtimes;
}}