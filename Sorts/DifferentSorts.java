
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DifferentSorts
{
    public static void bubbleSort(){
        int[] number = {11,24,30,45,12,20,32,41};
        // End Result: {11,12,20,24,30,32,41,45}

        for (int a = 0; a < number.length - 1; a++){
            for (int b = 0; b < number.length - 1; b++){
                if (number[b] >= number[b + 1]){
                    int variable = number[b + 1];
                    number[b + 1] = number[b];
                    number[b] = variable;
                }
            }
        }

        for (int c = 0; c < number.length; c++){
            System.out.print(" " + number[c]);
        }
        System.out.println();
    }

    public static void insertionSort(){
        int[] number = {11,24,30,45,12,20,32,41};
        // End Result: {11,12,20,24,30,32,41,45}

        for (int a = 0; a < number.length - 1; a++){
            for (int b = 0; b < number.length - 1; b++){
            }
        }

        for (int c = 0; c < number.length; c++){
            System.out.print(" " + number[c]);
        }
        System.out.println();
    }

    public static void selectionSort(){
        int[] number = {11,24,30,45,12,20,32,41};
        // End Result: {11,12,20,24,30,32,41,45}

        for (int a = 0; a < number.length - 1; a++){
            for (int b = a; b < number.length - 1; b++){
                int variable = 0;
                if (number[b] < number[a]){
                    int smallIndex = b;
                }
                variable = number[a];
                number[a + 1] = number[b];
                number[b] = variable;
            }
        }

        for (int c = 0; c < number.length; c++){
            System.out.print(" " + number[c]);
        }
        System.out.println();
    }
}
