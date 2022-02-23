
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
    String getName;
    public Item(String name){
        getName = name;
    }

    public void itemBuy(){
        System.out.println(getName + " the item has been bought.");
    }
    public void itemSell(){
        System.out.println(getName + " the item has been sold.");
    }

}
