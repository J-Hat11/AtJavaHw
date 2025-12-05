public class PartB {
    public static void main(String[] args) {
        int RandNum ;
        int RandNum2;

        do { 
            RandNum = (int) (Math.random() * 6) + 1;
            RandNum2 = (int) (Math.random() * 6) + 1;
            System.out.println("First Random Number: " + RandNum);
             printDie(RandNum);
            System.out.println("Second Random Number: " + RandNum2);
             printDie(RandNum2);
            
        
        } while (RandNum != RandNum2); 
        
        System.out.println("The numbers are equal! Ending Program!");
    }
            
        //open stax for reference on Bonus, can you display the output as ASCII art dice?

        public static String[] getLines(int face) {
            switch (face) {
    
                case 1:
                    return new String[]{
                        "-------",
                        "|     |",
                        "|  *  |",
                        "|     |",
                        "-------"
                    };
                case 2:
                    return new String[]{
                        "-------",
                        "| *   |",
                        "|     |",
                        "|   * |",
                        "-------"
                    };
                case 3:
                    return new String[]{
                        "-------",
                        "| *   |",
                        "|  *  |",
                        "|   * |",
                        "-------"
                    };
                case 4:
                    return new String[]{
                        "-------",
                        "| * * |",
                        "|     |",
                        "| * * |",
                        "-------"
                    };
                case 5:
                    return new String[]{
                        "-------",
                        "| * * |",
                        "|  *  |",
                        "| * * |",
                        "-------"
                    };
                case 6:
                    return new String[]{
                        "-------",
                        "| * * |",
                        "| * * |",
                        "| * * |",
                        "-------"
                    };
                default:
                    return new String[]{};
                }
            }

    //used ai for this part to figure out how to print the dice faces into my original program
    public static void printDie(int face) {
        String[] lines = getLines(face);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}