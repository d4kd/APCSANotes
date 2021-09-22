
/**
 * Write a description of class PencilSharpenerTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PencilSharpenerTester
{
    public static void main(){
        PencilSharpener mySharpener;
        mySharpener = new PencilSharpener();
        
        PencilSharpener yourSharpener = new PencilSharpener("Steel", "Red",
        "Swingline", 100.6, 5);
        System.out.println("I throw my pencil sharpener.");
        String result = mySharpener.throwSharpener();
        System.out.println(result);
        
        System.out.println("I throw my pencil sharpener again.");
        System.out.println(mySharpener.throwSharpener());
        System.out.println("This is my " + mySharpener.getBrand() + "Sharpener.");
    }
}
