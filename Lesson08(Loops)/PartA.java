import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mass of halflife(g): ");
        double mass = scanner.nextDouble();

        int year = 30;
        double percentage = 100;
        int years = 0;
       

        
        while (percentage > 1) {
                mass = mass / 2;
                percentage = percentage / 2;
                years += year;
               } 
               
               System.out.printf("After " + years + " Years, The remaining mass is " + mass + " grams and the percentage is " + percentage + "%%");
            
            }
        
    


            

        


        }
        
       



        


    

        