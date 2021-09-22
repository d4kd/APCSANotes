
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hand
{
    public static void main(){
        BlackJack playerHand = new BlackJack();
        BlackJack dealerHand = new BlackJack();
        
        System.out.println("Dealer has two cards, one is faced down.");
        System.out.println("The game has started, pull a card.");
        String Result = playerHand.pullCard();
        //System.out.println(result);
    }
}
