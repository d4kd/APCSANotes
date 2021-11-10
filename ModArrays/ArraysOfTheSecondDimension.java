
/**
 * Write a description of class ArraysOfTheSecondDimension here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraysOfTheSecondDimension
{
    private int[] arr;
    private int[][] arr2;
    private int[][][][][][][][][][] complexArr;
    private int[][][] arr3;
    
    public ArraysOfTheSecondDimension(){
        arr = new int[10];
        arr2 = new int[10][5];
        complexArr = new int[1][2][3][4][5][6][7][8][9][10];
        arr3 = new int [4][5][8];
    }
    
    public void addNums(){
        int num = 1;
        for (int r = 0; r < arr2.length; r++){
            for (int c = 0; c < arr2[0].length; c++){
                arr2[r][c] = num;
                num++;
            }
        }
    }
    
    //Fancy FOR Loops (Enhanced for Loops) (AKA "For EACH" Loop)
    public void printNums(){
        for (int[] miniArr: arr2){
            for (int num: miniArr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public void printAll(){
        for (int[][] idk: arr3){
            for (int[] row: idk){
                for (int num: row){
                    System.out.println(num);
                }
            }
        }
    }
}
