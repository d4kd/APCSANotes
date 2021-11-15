
/**
 * Write a description of class ModArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ModArray
{
    int[] arr;
    public ModArray(){
        arr = new int [5];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 9;
        arr[3] = 2;
    }
    public void insertNum(int num, int index){
        // insertNum(1, 2);
        // Goal: {3,7,1,9,2}
        for (int i = arr.length-1; i < index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = num;
    }
    public void removeNum(int index){
        // removeNum(1)
        // Goal: {3,1,9,2,0}
        for (int i = index; i < arr.length-1; i++){
            arr[i] = arr[i-1];
        }
        arr[arr.length-1] = 0;
    }
}
