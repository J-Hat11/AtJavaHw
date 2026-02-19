public class PartA {
    static double total =0;
   static int count = 0;

       static class CashRegister {
   public void addItem(double price) {
       total+=price;
       count++;
   }
   public double getTotal() {
       return total; 
       
   }
   public int getCount() {
       return count;
   }
   public void clear() {
       total = 0; 
       count = 0;
   }
}

//Given this public interface, what is the output for the following code?

public static void main(String[] args) {
   CashRegister cr = new CashRegister();
   cr.addItem(3.00);
   cr.addItem(1.50);
   System.out.printf("Total = $%.2f%n", cr.getTotal());
   cr.clear();
   cr.addItem(2.00);
   cr.addItem(2.50);
   System.out.println("You have " + cr.getCount() + " items.");
   System.out.printf("Total = $%.2f%n", cr.getTotal());
}



    }

// The code will return: Total = $4.50, you have 2 items, Total = $4.50
//This is because the cr.get total returns the total from 3.00+1.50 to get 4.50, then it clears the interface, then adds 2.00 + 2.50 to return the new total of 4.50