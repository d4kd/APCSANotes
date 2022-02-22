
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
    String name;
    public abstract void getName(String name);

    String getCondition;
    public void getCondition(){
        System.out.println(name + "'s condition is " + getCondition);
    }

    public void itemBuy(){
        System.out.println(name + " the item has been bought.");
    }
    public void itemSell(){
        System.out.println(name + " the item has been sold.");
    }

}
