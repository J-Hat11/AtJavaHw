public class PartB {
    public static boolean palindrome (String pldrm) {
        
        pldrm = pldrm.toLowerCase().replaceAll("[^a-z0-9]", "");
                for (int i = 0; i < pldrm.length() / 2; i++) {
if (pldrm.charAt(0)!= pldrm.charAt(pldrm.length() - 1)){
            return false;
}
}
return true;
}
public static void main(String[] args) {

        String phrase1 = "Madam, I'm Adam";
        String phrase2 = "Kayak";

        System.out.println(phrase1 + " ... Palindrome = " + palindrome(phrase1));
        System.out.println(phrase2  + " ... Palindrome = " + palindrome(phrase2));


    }
}