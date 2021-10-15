
/**
 * Write a description of class ArrayBrian here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayBrian
{
    public static void main(){
        int[] a = new int[2];
        a[0] = 5;
        a[1] = 10;
        int[] b = a;
        a[0] = 1;
        a[1] = 2;
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
