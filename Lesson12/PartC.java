import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Phrase: ");
        String phrase = scanner.next();

        int Vowels = vowelCount(phrase);
        System.out.printf("Vowels: " + Vowels);


    }
    public static int vowelCount(String phrase){
        int count = 0;
        for(int i = 0; i<phrase.length(); i++ ){
        char c = phrase.charAt(i);
        if(isvowel(c)){
            count++;
        }

        }
        return count;

    }
//used internet for help on how to use boolean for determining vowels
    public static boolean isvowel (char c){
        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; //only returns vowels



        
    }
        




    }







