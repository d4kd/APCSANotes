
/**
 * Write a description of class BlackJack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
import java.util.Scanner;
public class BlackJack
{    
    private String input;
        public BlackJack(){
        Scanner ran = new Scanner(System.in);
        int cardNum1 = (int)(Math.random() * 7 + 2);
        int playerTotal = 0;
        int newTotal1 = 0;
        int i = 0;
        while (i < 0){
            i++;
            if (cardNum1 == 21){
                System.out.println("Player has Won!");
            }else if (cardNum1 < 21){
                System.out.println("Would you like to Hit?");
                if (input.equals("hit")){
                    System.out.println("Player got " + cardNum1);
                    newTotal1 = (playerTotal + cardNum1);
                    newTotal1 = playerTotal;
                }else if (input.equals("stop")){
                    System.out.println("Player's turn is over");
                    System.out.println("Player's card total is" + playerTotal);
                }else{
                    System.out.println("ERROR");
                }
            }else if (cardNum1 > 21){
                System.out.println("Player has Lost!");
            }
            System.out.println("The total for Player is " + newTotal1);
        } 
    }
    
    private String dealer;
    private String player;
    private boolean flip;
    private boolean pull;
    public BlackJack(boolean theFlip, boolean thePull){
        flip = theFlip;
        pull = thePull;
    }
    
    public String dealer(){
        int cardNum2 = (int)(Math.random() * 7 + 2);
        int compTotal = 0;
        int newTotal2 = 0;
        int j = 0;
        while (j < 0){
            j++;
            if (cardNum2 == 21){
                System.out.println("Player has Lost!");
            }else if (cardNum2 < 21){
                //(input.equals("hit"));
                System.out.println("Dealer got " + cardNum2);
                newTotal2 = (compTotal + cardNum2);
                newTotal2 = compTotal;
                System.out.println("Dealer's card total is" + compTotal);
            }else if (cardNum2 > 21){
                System.out.println("Both turns are over");
                System.out.println("Player has Won!");
            }else{
                System.out.println("ERROR");
            }
            System.out.println("The total for Dealer is " + newTotal2);
        }
        return "The Dealer is finished playing.";
    }
    
    public String pullCard(){
        if(!pull){
            pull = true;
            return "You pulled a card.";
        }
        return "You didn't pull a card.";
    }
    public String flipCard(){
        if(!flip){
            flip = true;
            return "The Delear's card is flipped.";
        }
        return "The Dealer's card isn't flipped yet.";
    }
    
    public boolean isFlip(){
        return flip;
    }
        public boolean isPull(){
        return pull;
    }
}
