
/**
 * Write a description of class StringNotes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringNotes
{
    public static void main1(){
        int c = 5;
        int d = 5;
        System.out.println(c == d);
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println(scanner1 == scanner2);
        System.out.println(scanner1);
        
        // When we assign a variablle (when dealing with objects)
        // It stores a reference to the Memory Location, not the object itself.
        // This is why scanner1 == scanner2 is false.
    }
    public static void main2(){
        String a = "The quick brown fox jumps over the lazy dog.";
        System.out.println("There are " + a.length() + " characters.");
        String firstWord = a.substring(0, 3);
        // Substring includes the first number, and goes up to (but NOT include)
        // The second number.
        System.out.println("The first word is: " + firstWord);
        String secondWord = a.substring(4, 9);
        System.out.println("The second word is: " + secondWord);
        String lazy = a.substring(34, 38);
        System.out.println("This is the word 'lazy': " + lazy);
        
        String noFirstWord = a.substring(4);
        System.out.println(noFirstWord);
    }
    public static void main3(){
        String a = "The quick brown fox jumps over the lazy dog.";
        int b = a.indexOf("THE");
        System.out.println(b);
        int c = a.toLowerCase().indexOf("THE".toLowerCase());
        System.out.println(c);
        int d = a.toLowerCase().indexOf("the", 10); // Skip over using "", int
        System.out.println(d);
    }
    public static void main4(){
        System.out.println("Pick a letter");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("h")){
            System.out.println("You typed in an \"H\"");
        }else{
            System.out.println("You did not type in an \"H\"");
        }
    }
    public static void main5(){
        String a = "Carnival";
        String b = "Pineapple";
        String c = "Cheese";
        System.out.println(a.compareTo(b)); // Num of space between ca - pi -
        System.out.println(b.compareTo(a)); // Num of space between pi - ca +
        System.out.println(a.compareTo(c)); // Num of space between ca - ch -
        System.out.println(c.compareTo(a)); // Num of space between ch - ca +
        // If second word come first, alphabetically, it will be positive.
        // If first word come first, alphabetically, it will be negative.
    }
    public static void printVertically(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.substring(i, i+1));
        }
    }
}
