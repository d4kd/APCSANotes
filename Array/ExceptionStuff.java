
/**
 * Write a description of class ExceptionStuff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExceptionStuff
{
    public static void main(int x) throws Exception{
        if (x < 0){
            throw new Exception("This is a negative number");
        }
        System.out.println(x);
    }
    public static void main2(){
        for (int i = -5; i < 5; i++){
            try{
                System.out.print(i + ": ");
                main(i);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
