import java.util.Scanner;

public class Parta {
    enum AgeType {
        BABY, CHILD, ADULT, SENIOR}
    enum DayofWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.print ("Enter a day of the week (First three letters): ");
        String day = scanner.nextLine().toLowerCase();

        DayofWeek Day;
        switch(day) {
            case "mon", "monday" -> Day = DayofWeek.MONDAY;
            case "tue", "tuesday" -> Day = DayofWeek.TUESDAY;
            case "wed", "wednesday" -> Day = DayofWeek.WEDNESDAY;
            case "thu", "thurseday" -> Day = DayofWeek.THURSDAY;
            case "fri", "friday" -> Day = DayofWeek.FRIDAY;
            case "sat", "saturday" -> Day = DayofWeek.SATURDAY;
            case "sun", "sunday" -> Day = DayofWeek.SUNDAY;
            default -> {
    System.err.println("Error: Unknown day. Stopping program.");
                return;
            }

        }

         System.out.print("Enter the time (HH:MM): ");//used student help / ai to help understand military time in code
            String military = scanner.nextLine().trim();

            int Hour = 0;
            int Min = 0;

            if (military.contains(":")) {
                int i = military.indexOf(":");
                Hour = Integer.parseInt(military.substring(0, i));
                Min = Integer.parseInt(military.substring(i + 1));
            } else {
                System.err.println(" Unable to anlyze time, stopping program.");
                return;
            }


        int age = -1;
        while (true) {
            System.out.print("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0) {
                    break;
                } else { 
                    System.err.println("Error: Unknown age. Stopping program.");
                    return;
                }
            }
        }
        AgeType Type;
    if (age<2) {
        Type = AgeType.BABY;
    } else if (age<=12) {
       Type = AgeType.CHILD;
    } else if (age<=59) {
        Type = AgeType.ADULT;
    }  else {
        Type = AgeType.SENIOR;
    }

        System.out.print("Are you a student? (y/n): ");
        char studentChar = scanner.next().charAt(0);
        boolean StudentStatus = studentChar == ('y'); //used copilot to determine why boolean Studentstatus = studentChar.equals('y') was not working (char is a primitive data type and does not have methods like equals)

    double ticketPrice = 0.0;
    int time = Hour * 100 + Min; 
    
    if(Day.ordinal() >= DayofWeek.MONDAY.ordinal() && Day.ordinal() <= DayofWeek.FRIDAY.ordinal()) { //used ai to determine how to use Ordinal method to do monday - friday instead of listing out each day;
        if(time >= 600 && time <= 759 || time >= 1600 && time <= 1759) {
            ticketPrice = 100.0;
         } else { 
        ticketPrice = 90.0;}
         }else {
ticketPrice = 80.0;
    }

    double finalPrice = ticketPrice;
    double AgeDiscount = 0.0;
    double PriceAfterAgeDiscount = ticketPrice;


    if (Type.equals(AgeType.BABY) ) {
        AgeDiscount = ticketPrice; 
        PriceAfterAgeDiscount = 0.0;

    } else if (Type.equals(AgeType.CHILD)) {
        AgeDiscount = ticketPrice * 0.20;
        PriceAfterAgeDiscount = ticketPrice - AgeDiscount;
    } else if (Type.equals(AgeType.ADULT)) {
        AgeDiscount = 0.0;
          PriceAfterAgeDiscount = ticketPrice - AgeDiscount;
    } else if (Type.equals(AgeType.SENIOR)) {
        AgeDiscount = ticketPrice * 0.25;
          PriceAfterAgeDiscount = ticketPrice - AgeDiscount;

    }
double StudentDiscount = 0.0;
if (StudentStatus) {
    StudentDiscount = PriceAfterAgeDiscount * 0.05;
    
}
finalPrice = PriceAfterAgeDiscount - StudentDiscount;

    System.out.println("--------------------------------------------------");
    System.out.printf("Name: %s%n", name);
    System.out.printf("Day of the Week: %s%n", Day);
    System.out.printf("Time (24-hour format): %02d:%02d%n", Hour, Min);
    System.out.println("--------------------------------------------------");
    System.out.printf("Ticket Price: $%.2f%n", ticketPrice);
    System.out.printf("Age Discount: $%.2f%n", AgeDiscount);
    System.out.printf("Student Discount: $%.2f%n", StudentDiscount);
    System.out.println("--------------------------------------------------");
    System.out.printf("Final Price : $%.2f%n", finalPrice);
    System.out.println("--------------------------------------------------");
   
}
}