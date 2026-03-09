
import java.time.LocalDate;
import java.time.LocalTime;

//Packages: .time is the sub package and LocalDate/LocalTime are classes of this subpackage
//Parent Packages: java

public class PartA {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("The current Date is: " + today);
        System.out.println("The current Time is: " + time);
    }
}


