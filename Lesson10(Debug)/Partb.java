import java.util.Scanner;

public class Partb {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Enter number of cookies: ");
int num = in.nextInt();
double discount =0;//I initialized the variable here
//double discount; //this was the original line causing the error
        if (num < 12 && num>6) {//logic error here and on line 12 because all numbers above 12 will also be above 6 so the first condition will always be true for those numbers
discount = 0.05;
    } else if (num >= 12) {
discount = 0.10;
}
System.out.println("Discount = " + discount);  

}
}
//This is a compile error because the variable 'discount' was not initialized.