import java.util.Scanner;

public class ARRAY {

    //used AI to help debug code 

    public static int remove(double[] array, int currentSize, int targetIndex) {
if(targetIndex < 0 || targetIndex >= currentSize) {
    return currentSize;
}
for (int i = targetIndex; i <currentSize-1; i++){
    array[i] = array[i+1];
}
return currentSize-1;
}


public static int insert(double[] array, int currentSize, int targetIndex, double newElement) {
    if (currentSize>=array.length || targetIndex<0 ||targetIndex>currentSize){
        return currentSize;
    }
    for (int i = currentSize; i>targetIndex; i--){
          array[i] = array[i-1];
    }
    array [targetIndex] = newElement;
    return currentSize+1;

}

    




    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    double[] tests = new double[10];
    int count = 0;

    System.out.print("Enter Ten Test Scores or q to quit: ");

    while (count<10){

    if (scanner.hasNext("q") || scanner.hasNext("Q")) {
    System.out.println("Done entering input.");
    break;
    }

    if (scanner.hasNextDouble()) {
        tests [count] = scanner.nextDouble();
        count++;

    } else {
        System.out.print("Invalid input");
        scanner.next();

    }
    }
    






    double total = 0;
    double smallest = tests[0];
    double largest = tests[0];

    
        for (int i = 0; i < count; i++) {
            total = total + tests[i];
           

            if (tests[i] > largest) {
                largest = tests[i];

            }
            if (tests[i] < smallest) {
                smallest = tests[i];

            }
            }
         System.out.println("Smallest Value: " + smallest);

            System.out.println("Largest Value: " + largest);

            double average = total/count;

            System.out.println("Average Value: " + average);

            count = remove(tests, count,0);
            count = insert(tests, count,0, 41);
    


        }
        

    }




    

    
