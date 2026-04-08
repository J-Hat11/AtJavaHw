public class Main {
    public static void main(String[] args) {
        
    
    BaseballCard card1 = new BaseballCard("Babe Ruth", 1927);
    BaseballCard card2 = new BaseballCard("Shohei Ohtani", 2018);
    BaseballCard card3 = new BaseballCard("Shohei Ohtani", 2018);
   
    System.out.println(card1);
    System.out.println(card2);
    System.out.println(card3);

    System.out.println("Card 1 = Card 2?" + card1.equals(card2));
    System.out.println("Card 2 = Card 3?" + card2.equals(card3));
    }
}