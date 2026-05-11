public class TowersOfHanoi {
    //used ai to debug capitalization problems
    public static int getInterim(int start, int end){
        return 6 - start - end; //to determine sequence
    }
    public static void PrintMove(int start, int end){
        System.out.println(start + " -> " + end);
    }
    public static void hanoi(int n, int start, int end) {
if(n==1){
    PrintMove(start,end);
} else {
    int getInterim = getInterim(start, end);
    hanoi(n-1, start, getInterim);
    PrintMove(start,end);
    hanoi(n-1, getInterim, end);
}
}
public static void main(String[] args) {
    int circles = 3;
    System.out.println( circles + " discs:");
    System.out.println("Moving from column 1 to column 3: ");
    System.out.println();
     hanoi(circles, 1, 3);
}
}
