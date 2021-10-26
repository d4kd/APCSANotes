
/**
 * Write a description of class PencilSharpener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PencilSharpener{
    
    //Things a pencil sharpener has:
    //We call these private instance variables, or fields.
    private String blade;
    private String color;
    private String brand;
    private double weight;
    private int size;
    private boolean broken;
    //Constructors
    public PencilSharpener(String theBlade, String theColor, String theBrand, 
    double lbs, int theSize){
        blade = theBlade;
        color = theColor;
        brand = theBrand;
        weight = lbs;
        size = theSize;
        broken = false;
    }
    public PencilSharpener(){
        blade = "Paper";
        color = "Black";
        brand = "NoName";
        weight = 1.7;
        size = 3;
        broken = false;
    }
    public String SharpenPencil(){
        return "You sharpened a pencil";
    }
    public String throwSharpener(){
        if(!broken){
            broken = true;
            return "It's not broken. Good job.";
        }
        return "It's already broken";
    }
    
        public String getBrand(){
        return brand;
    }
        public String getColor(){
        return color;
    }
        public String getBlade(){
        return blade;
    }
        public boolean isBroken(){
        return broken;
    }
}
