
/**
 * Write a description of class Arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }

    int[] numbers;
    // You can use curly braces IF you declare and initiate on the same line
    String[] words = {"Good", "Day", "Sir!"};
    PencilSharpener[] sharpeners;
    public Arrays(){
        numbers = new int[5];
        //Put numbers into an array
        numbers[0] = 3;
        numbers[1] = 4;
        numbers[2] = 9;
        numbers[3] = 5;
        //Modifying an array
        numbers[1] = 8;
        
        //Get info from an array
        System.out.println(words[1]);
        
        //Other stuff
        sharpeners = new PencilSharpener[10];
        for (int i = 0; i < sharpeners.length; i ++){
            sharpeners[i] = new PencilSharpener();
        }
        for (int i = 0; i < sharpeners.length; i ++){
            System.out.println(sharpeners[i]);
        }
        for (int i = 0; i < sharpeners.length; i ++){
            System.out.println(sharpeners[i].throwSharpener().indexOf("broken"));
        }
        
    }
}
