
/**
 * Write a description of class Recovery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recovery extends Potion
{
    int numberOfHealth;
    boolean isUsed;
    public Recovery(){
        super();
        numberOfHealth = 70;
        isUsed = false;
    }
    
    // public Recovery(String system, int health){
        // super(system);
        // numberOfHealth = health;
        // if (health > 70){
            // isUsed = true;
        // }
        // isUsed = false;
    // }
}
