public class PartB {

    public static void printTriangle(int n) {
        if(n<=0){
            return;
        }
   
    printTriangle(n-1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
    }
     System.out.println();
   
}
 public static void main(String[] args) {
       printTriangle(5);
   }


}

