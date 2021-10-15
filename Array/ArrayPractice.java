
/**
 * Write a description of class ArrayPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayPractice
{
    int[] arr;
    /** Create an array with x ints, starting at 1 and going to x.
     * 
     */
    public ArrayPractice(int x){
        arr = new int[x];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        //for (int i = 1; i <= arr.length; i++){ //Same end result
        //    arr[i-1] = i;
        //}
    }
    /** Adds all the numbers in the array.
     * 
     */
    public int getSum(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    /** Find the average of all the numbers in the array
     * 
     */
    public double getAverage(){
        double average = (double) getSum() / arr.length;
        return average;
    }
        /** Find the largest number in the array
     * 
     */
    public int getLargest(){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
