import java.util.Scanner;

public class Parta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = 1000;
        String[]words = new String[max];
        int currentSize=0;

        while (true){
            System.out.print("Enter a word or phrase or 'q' to quit: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) { //looked up how to ignore case instead of using || or
                System.out.println("Ending program");
                break;
            }
            words[currentSize] = input;
            currentSize++;
        } 
        System.out.printf("Current size = "+ currentSize);
        System.out.println();
       for(int i=0; i<currentSize; i++){
        System.out.println(words[i]);
       }
       System.out.println("Modified Array... ");
       cleanup(words,currentSize);
       for(int i=0; i<currentSize; i++){
        System.out.println(words[i]);}
    }
    //used ai to help debug and help with this part
    public static void cleanup(String[] arr, int size) {
        for(int i=0; i<size; i++){
            String s = arr[i].trim();
            s = s.toLowerCase();
            s = s.substring(0,1).toUpperCase()+s.substring(1);
            arr[i]=s;

     
       }
    }
}
