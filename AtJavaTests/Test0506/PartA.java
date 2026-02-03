import java.util.Arrays;

public class PartA {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        swap(2,7, numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void swap(int x, int y, int [] array) {
        if(x<0 || x>=array.length || y<0 || y>=array.length){
            System.out.println("Error");
            return;
        } else {
        int val = array[x];
         array[x] = array[y];
         array[y]=val;
    }
    }
}