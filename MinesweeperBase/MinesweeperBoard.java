
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard{
    Cell[] board;
    int rows;
    int columns;

    public MinesweeperBoard(int row, int col){
        //Put the constructor here.
        board = new Cell[col * row];
        columns = col;
        rows = row;
        
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public MinesweeperBoard(){
        this(10,10);
    }

    public void addMines(int mines) throws Exception{
        if (mines > board.length){
            throw new Exception("More bombs than slots...Try a Smaller number");
        }else if (mines == board.length){
            throw new Exception("Same amount of bombs as slots...Try a Smaller number");
        }
        
        for (int i = 0; i < mines; i++){
            int mine = (int)(Math.random() * (rows*columns));
            if (board[mine].getValue() == 0){
                board[mine].getMine();
                board[mine].isMine();
            } else{
                i--;
            }
        }
    }

    public void addNums(){
        for (int i = 0; i < board.length; i++){
            if (!board[i].isMine()){
                int count = 0;
                if (i+1 < board.length && board[i+1].isMine()){
                    // Num to the Right (columns + 1)
                    count++; //Use Mod
                }
                if (i-1 >= 0 && board[i-1].isMine()){
                    // Num to the Left (columns - 1)
                    count++; //Use Mod
                }
                if (i-columns >= 0 && board[i-columns].isMine()){
                    // Num Upward (rows - columns)
                    count++; //Use Mod
                }
                if (i+columns < board.length && board[i+columns].isMine()){
                    // Num Downward (rows + columns)
                    count++; //Use Mod
                }
                if ((i-columns) + 1 >= 0 && board[(i-columns) + 1].isMine()){
                    // Num Upward Right (rows - columns) + 1
                    count++; //Use Mod
                }
                if ((i-columns) - 1 >= 0 && board[(i-columns) - 1].isMine()){
                    // Num Upward Left (rows - columns) - 1
                    count++; //Use Mod
                }
                if ((i+columns) + 1 < board.length && board[(i+columns) + 1].isMine()){
                    // Num Downward Right (rows + columns) + 1
                    count++; //Use Mod
                }
                if ((i+columns) - 1 < board.length && board[(i+columns) - 1].isMine()){
                    // Num Downward Left (rows + columns) - 1
                    count++; //Use Mod
                }
                board[i].setValue(count);
            }
        }
    }    
    
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        System.out.println(" ");
        System.out.println("Welcome !");
        System.out.println(" ");
        for (int i = 0; i < board.length; i++){
            if ((i%columns) == 0 && i != 0){
                System.out.println(" ");
            }
            if (board[i].isMine()){
                System.out.print("X");
            }else {
                System.out.print(board[i].getValue());
            }
            System.out.print(" ");
        }
    }
    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i < rows*columns; i++){
                board[i]= new Cell();
                panel.add(board[i].getButton());
        }
        return panel;
    }
}
