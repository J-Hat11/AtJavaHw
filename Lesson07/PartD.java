import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = 0;

        System.out.print("Enter a Positive Integer (1-3999): ");

        if (scanner.hasNextInt()) {
        Number = scanner.nextInt();

           if (Number>=1 && Number<=3999) {
        System.out.println("Thankyou For entering a valid number ");
        String RomanNum = RomanNumeral (Number);
        System.out.println("Roman Numeral: " + RomanNum);
           } else if (Number<1 || Number>3999) {
            System.out.print("Error Number must be from 1-3999");      
           }
} else {
           System.out.print("You Must Enter A Valid Integer");   
        }
        }


public static String RomanNumeral(int Number) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[ Number/1000 ] +
        hundreds [ (Number%1000) / 100 ] +
        tens [ (Number%100) / 10 ] +
        ones [ Number%10 ];

}
    
}

