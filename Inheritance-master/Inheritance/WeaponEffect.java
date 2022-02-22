
/**
 * This 
 *
 * @author Carmona
 * @version (a version number or a date)
 */
public class WeaponEffect implements WeaponInterface
{
    public int attack(){
        int damage = (int)(Math.random() * 5 + 6);
        return damage * 10^10;
    }

    public boolean parry(){
        if (attack() >= 7){
            return true;
        }
        return false;
    }

}
