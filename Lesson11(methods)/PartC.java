import java.util.Scanner;
public class PartC {

public static double SphereVolume (double Radius){
    return (4.0/3.0)*(Math.PI)*(Math.pow(Radius, 3));

}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of a circle as a double: ");
        double Radius = scanner.nextDouble();

        Double volume = SphereVolume(Radius);

        System.out.printf("The volume of your sphere is: %.2f%n", volume);



    
    }
}
