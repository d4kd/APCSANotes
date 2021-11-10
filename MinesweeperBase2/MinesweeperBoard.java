
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
    Cell[][] board;
    int rows;
    int columns;

    public MinesweeperBoard(int row, int col){
        //Put the constructor here.
        board = new Cell[row][col];

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
        for (int i = 0; i < mines; i++){
            int r = (int)(Math.random() * (board.length));
            int c = (int)(Math.random() * (board[0].length));
            if (board[r][c].getValue() == 0){
                board[r][c].getMine();
                board[r][c].isMine();
            } else{
                i--;
            }
        }
    }

    public void addNums(){
        for (int r = 0; r < board.length; r++){
            for (int c = 0; c < board[0].length; c++){
                if (!board[r][c].isMine()){
                    int count = 0;
                    if (c-1 >= 0 && board[r][c-1].isMine()){
                        // Num to the Left (columns - 1)
                        count++;
                    }
                    if (c+1 < columns && board[r][c+1].isMine()){
                        // Num to the Right (columns + 1)
                        count++;
                    }
                    if (r-1 >= 0 && board[r-1][c].isMine()){
                        // Num Upward (rows - columns)
                        count++;
                    }
                    if (r-1 >= 0 && c-1 >= 0 && board[r-1][c-1].isMine()){
                        // Num Upward Left (rows - columns) - 1
                        count++;
                    }
                    if (r-1 >= 0 && c+1 < columns && board[r-1][c+1].isMine()){
                        // Num Upward Right (rows - columns) + 1
                        count++;
                    }
                    if (r+1 < rows && board[r+1][c].isMine()){
                        // Num Downward (rows + columns)
                        count++;
                    }
                    if (r+1 < rows && c-1 >= 0 && board[r+1][c-1].isMine()){
                        // Num Downward Left (rows + columns) - 1
                        count++;
                    }
                    if (r+1 < rows && c+1 < columns && board[r+1][c+1].isMine()){
                        // Num Downward Right (rows + columns) + 1
                        count++;
                    }
                    board[r][c].setValue(count);
                }
            }
        }
    }    

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        System.out.println("Welcome !");
        System.out.println(" ");
        for (int r = 0; r < board.length; r++){
            for (int c = 0; c < board[0].length; c++){
                int line = board[r][c].getValue();
                if (board[r][c].isMine()){
                    System.out.print("X ");
                }else {
                    System.out.print(line + " ");
                }
            }
            System.out.println(" ");
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int r = 0; r < board.length; r++){
            for (int c = 0; c < board[0].length; c++){
                board[r][c]= new Cell();
                panel.add(board[r][c].getButton());
            }
        }
        return panel;
    }
}
