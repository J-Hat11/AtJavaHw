import java.util.ArrayList;
import java.util.Scanner;
    
class CashRegister {
   private static ArrayList<Double> items;
   
   public CashRegister() {
       items = new ArrayList<Double>();
   }
   public static void addItem(double price) {
       items.add(price);
   }
   public static void removeItem() {
if(items.size()>0){
    items.remove(items.size ()-1);
}
   }
   public static double getTotal() {
       double total = 0; 
       for(double price : items){
        total+=price;
       }
       return total;
   }
   public static int getCount() {
       return items.size();
   }
   public static void clear() {
       items.clear();
   }
}
public class PartB {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    CashRegister Register = new CashRegister();
    String Userinput;
    
    
    while(true){
        System.out.print("Enter 'q' to quit the program, 'c' to clear, 't' to display the total, or 'd' to delete last entry: ");
        Userinput = input.nextLine();
        if(Userinput.equalsIgnoreCase("q")){
            break;
        } else if (Userinput.equalsIgnoreCase("c")){
            CashRegister.clear();
            System.out.println("Register cleared");
        } else if(Userinput.equalsIgnoreCase("t")){
            System.out.print("Sales total: " + CashRegister.getTotal() + " Item Count: " + CashRegister.getCount() );
        } else if (Userinput.equalsIgnoreCase("d")){
            CashRegister.removeItem();
            System.out.println("Last item removed");
        } else {
            try {
                double price = Double.parseDouble(Userinput);
                CashRegister.addItem(price);
                System.out.println("Item Added");
            }
            catch (NumberFormatException e){
                System.out.println("invalid");
            }
        }
    }
input.close();


}



}




