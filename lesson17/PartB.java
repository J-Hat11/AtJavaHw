public class PartB {
    public static void main(String[] args) {

int [][]Array1  = {
{8, 6, 7},
{5, 3, 0}
    };
int [][]Array2  = {
{0, 7, 6, 5},
{2, 2, 0, 1},
{8, 4, 5, 7}

};
System.out.println("First Array: ");
print(Array1);
System.out.println("Second Array: ");
print(Array2);
}


public static void print(int[][] values){

        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[0].length; col++) {
                System.out.print(values[row][col]);
                
                if (col < values[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }


}
}