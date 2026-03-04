
public class PartC {
    public static void main(String[] args) {
       Customer.lastSerialUsed = 100;
       Customer c1 = new Customer("Sal's Deli");
       c1.addSale(100);
       Customer c2 = c1;
       c2.addSale(50);
       System.out.println(c1.getSales());
       System.out.println(c2.getSales());
   }

    }
class Customer {
private String companyName;
private double totalSales;
private int numberSales;
private int regionCode;

private int serialNumber;
public static int lastSerialUsed = 0;

public Customer(String name) {
       companyName = name;
       totalSales = 0;
       numberSales = 0;
       regionCode = 0;

       lastSerialUsed++;
       serialNumber = lastSerialUsed;
   }



public String getName() {
	return companyName;
   }
   public void setName(String new_name) {
       companyName = new_name;
   }
   public void setRegion(int new_region) {
       regionCode = new_region;
   }
   public int getRegion() {
       return regionCode;
   }
   public void addSale(double amount) {
       totalSales+=amount;
       numberSales++;
   }
   public double getSales() {
       return totalSales;
   }
   public int getNumber() {
       return numberSales;
   }
   public double getAverage() {
       if(numberSales ==0){
        return 0;
       }
       return totalSales / numberSales;
   }
   public void reset(){
    totalSales =0;
    numberSales =0;
   }



}
    
//the output of this code is 150.0 and 150.0 
//This is because when c1 is initialized and is added 100 to it, this reference is copied to c2 so both c1 and c2 are the same 
//so becuase they reference the same object c1 and c2 both get 50 added so c1=150 and c2=150