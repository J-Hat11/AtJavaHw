
//    class Item {
 //  private int value;

    //public void setValue(int value) {
        //value = value;
  //  }
  //  public int getValue() {
   //     return value;
   // }
//}
//public class PartB {
    //public static void main(String[] args) {
      //  Item myItem = new Item();
        //System.out.println("Before: " + myItem.getValue());
        //myItem.setValue(13);
        //System.out.println("After: " + myItem.getValue());
   // }
///}

//The following output of the original code is Before: 0 After: 0 .
//This is because the varibale 'value' is defined in the class and inside the method. 
//When int value; is written the value is assigned as 0 by java
//When value = value; it is assigning the value in the method to itself which is 13;
//So when Setvalue runs it sets 13=13; which does nothing and is irrelevant to the main class
//So the origianl int Value = 0; is the accepted code making the before and after 0; 
//To fix this so the after is 13, the setValue method you can make the following changes below:


    class Item {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
public class PartB {
    public static void main(String[] args) {
        Item myItem = new Item();
        System.out.println("Before: " + myItem.getValue());
        myItem.setValue(13);
        System.out.println("After: " + myItem.getValue());
    }
}
