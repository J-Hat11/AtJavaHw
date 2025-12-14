import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double input: ");
        double a = scanner.nextDouble();
        System.out.print("Enter a double input: ");
        double b = scanner.nextDouble();
        System.out.print("Enter a double input: ");
        double c = scanner.nextDouble();

        //Used internet to recall how to call method
        double output = smallest(a,b,c);
        System.out.print(output);

        
    }

    
    public static double smallest (double a, double b, double c){
        double min = a;
        if (b<min){
        min = b;
        }
    if (c< min) {
        min =c;
    }
    return min;

}}


    

        
    

