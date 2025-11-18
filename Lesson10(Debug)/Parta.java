public class Parta {
    public static void main(String[] args) {
    String name = "Harry";
    System.out.println("The last letter of the name is " +
    name.charAt(name.length()-1));//I added the minus 1 here
    //Error on line 5
    //This is a compile error because the name length is equal to 5 letters but the name starts at 0. So the last letter is at index 4 and the code tries to get the letter at index 5. 

        
}

    }
