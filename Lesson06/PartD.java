import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many cookies you want to buy: "); 
        int numOfCookies = scanner.nextInt();

        double cookiesPrice = 0.99;
        double Discount = 0.00;


        if (numOfCookies>24) {
            Discount = 0.15;   
        } else if (numOfCookies>12) {
            Discount = 0.05;
        } else if (numOfCookies>6) {
             Discount = 0.025;
        }

        double cost = cookiesPrice * numOfCookies;
        double totalcost = cost * Discount;
        double DiscountTotal = cost - totalcost;
        
        System.out.printf("Your total before discount is $%.2f%n" , cost);
        System.out.println("Your discount is " + Discount *100 + "%");
        System.out.printf("Your total for " + numOfCookies + " Cookies is $%.2f%n" , DiscountTotal);
        
    }
    

}
