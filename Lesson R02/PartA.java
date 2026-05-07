public class PartA {
    public static boolean palindrome (String pldrm) {
        //looked up replace all 
        pldrm = pldrm.toLowerCase().replaceAll("[^a-z0-9]", "");
        if(pldrm.length()<=1){
            return true;
        }
        if (pldrm.charAt(0)!= pldrm.charAt(pldrm.length() - 1)){
            return false;
        }
        String middle = pldrm.substring(1, pldrm.length() - 1);
        return palindrome(middle);

}

 public static void main(String[] args) {

        String phrase1 = "Madam, I'm Adam";
        String phrase2 = "Kayak";

        System.out.println(phrase1 + " ... Palindrome = " + palindrome(phrase1));
        System.out.println(phrase2  + " ... Palindrome = " + palindrome(phrase2));


    }
}