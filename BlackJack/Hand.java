
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Hand
{
    public static void main(){
        BlackJack myJack;
        myJack = new BlackJack();
        
        BlackJack yourJack;
        yourJack = new BlackJack();
        
        System.out.println("The dealer has set up the game.");
        String result = myJack.pullCard();
        System.out.println(result);
    }
}
