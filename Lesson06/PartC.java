//Doesnt produce 3.6 as product because floating point numbers like doubles can store 3.6 as 3.599999...

public class PartC {
 public static void main(String[] args) {
    final double THRESHOLD = 1e-14;
        
double a = 1.2; 
double b= 3.0;
double c = a * b; 

System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);


if (Math.abs(3.6-c) < THRESHOLD) {
            System.out.println("C is 3.6");
        } else {
            System.out.println("C is not 3.6");
        }
    }
}