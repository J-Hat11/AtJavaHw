import java.util.ArrayList;
import java.util.Scanner;
public class BlackJackgame {
    //consulted classmates and used ai to help debug program specifcally regarding nested loops
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            
            ArrayList<Card> playerHand = new ArrayList<>();
            ArrayList<Card> dealerHand = new ArrayList<>();
            int playerScore = 0;
            int dealerScore = 0;

            // Deal initial cards
            playerHand.add(new Card());
            playerHand.add(new Card());
            dealerHand.add(new Card());
            dealerHand.add(new Card());

        
            playerScore = calculateScore(playerHand);
            dealerScore = calculateScore(dealerHand);

      
            System.out.println("Your hand: " + handToString(playerHand) + " (Score: " + playerScore + ")");
            System.out.println("Dealer's hand: " + dealerHand.get(0).getFace() + " [Hidden]");


            if (playerScore == 21 && dealerScore == 21) {
                System.out.println("Both you and the dealer have blackjack! It's a draw.");
                continue;
            } else if (playerScore == 21) {
                System.out.println("You have blackjack! You win!");
                continue;
            } else if (dealerScore == 21) {
                System.out.println("Dealer has blackjack! You lose.");
                continue;
            }

         
            boolean playerTurn = true;
            while (playerTurn) {
                System.out.print("Do you want to hit or stand? (h/s): ");
                String choice = scanner.nextLine().toLowerCase();
                if (choice.equals("h")) {
                    playerHand.add(new Card());
                    playerScore = calculateScore(playerHand);
                    System.out.println("Your hand: " + handToString(playerHand) + " (Score: " + playerScore + ")");
                    if (playerScore > 21) {
                        System.out.println("You bust! You lose.");
                        playerTurn = false;
                    }
                } else if (choice.equals("s")) {
                    playerTurn = false;
                } else {
                    System.out.println("Invalid choice. Please enter 'h' to hit or 's' to stand.");
                }
            }


            if (playerScore <= 21) {
                System.out.println("Dealer's hand: " + handToString(dealerHand) + " (Score: " + dealerScore + ")");
                while (dealerScore < 17) {
                    dealerHand.add(new Card());
                    dealerScore = calculateScore(dealerHand);
                    System.out.println("Dealer hits: " + handToString(dealerHand) + " (Score: " + dealerScore + ")");
                }   
                if (dealerScore > 21) {
                    System.out.println("Dealer busts! You win!");
                } else if (dealerScore > playerScore) {
                    System.out.println("Dealer wins with a score of " + dealerScore + "!");
                } else if (dealerScore < playerScore) {
                    System.out.println("You win with a score of " + playerScore + "!");
                } else {
                    System.out.println("It's a draw with both scoring " + playerScore + "!");
                }
            }

          
            System.out.print("Do you want to play another hand? (y/n): ");
            String playAgainChoice = scanner.nextLine().toLowerCase();
            playAgain = playAgainChoice.equals("y");
        }   
        System.out.println("Thanks for playing!");
        scanner.close();
    }   

    private static int calculateScore(ArrayList<Card> hand) {
        int score = 0;
        int aceCount = 0;

        for (Card card : hand) {
            switch (card.getRank()) {
                case TWO:   score += 2; break;
                case THREE: score += 3; break;
                case FOUR:  score += 4; break;
                case FIVE:  score += 5; break;
                case SIX:   score += 6; break;
                case SEVEN: score += 7; break;
                case EIGHT: score += 8; break;
                case NINE:  score += 9; break;
                case TEN:
                case JACK:
                case QUEEN:
                case KING:  score += 10; break;
                case ACE:   score += 11; aceCount++; break;
            }
        }

        while (score > 21 && aceCount > 0) {
            score -= 10; 
            aceCount--;
        }

        return score;
    }

    private static String handToString(ArrayList<Card> hand) {
        StringBuilder sb = new StringBuilder();
        for (Card card : hand) {
            sb.append(card.getFace()).append(" ");
        }
        return sb.toString().trim();
    }
}