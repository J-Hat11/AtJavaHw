public class PartB {
    public static void main(String[] args) {

    double [] numbers = { 2.2, 1.0, 3.7, 4.1, 88.0 };
    double sum = 0.0;
    for (double element: numbers ){ //referenced class slideshow for enhanced loop information
        System.out.println(element);
        sum+=element;
        
    }
    
   double Avg = sum/5;
   System.out.println("Avg = " + Avg);



        
    }
}
