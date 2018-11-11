import java.util.Scanner;
import java.lang.System;



public class TIcTacToe {
    public static void  main(String[]args){
        //pieces (nouns)
        // Xs and Os
        //game board
        //track who's turn it is

        //behaviors (verbs)
        //what square do you wanna play?
        // -make sure it isn't occupied
        //display game board
        //make a blank game board
        //check to see if someone wins (or board is full)

// receive input from user





        String [][]board= makeNewBoard();
        board[2][1]="X";
        board[2][2]="X";
        board[2][0]="X";
        displayBoard(board);
        System.out.println(determineWinner(board));
    }
    public static String [][] makeNewBoard() {
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) board[i][j] = ".";
        }
        return board;
    }



    public static void displayBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
                if (j != 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }



    public static String determineWinner(String[][]board){
       for (int i =0; i<board.length; i++){
           if (board[i][0].equals(board[i][1]) && board[i][2].equals(board[i][0]) && !board[i][0].equals(".")) {
               return board[i][0];
           }
           if (board[0][i].equals(board[1][i]) && board[2][i].equals(board[0][i]) && !board[0][i].equals(".")) {
               return board[0][i];
           }
       }
        if (board[0][0].equals(board[1][1]) && board[2][2].equals(board[0][0]) && !board[0][0].equals(".")) {
            return board[0][0];
        }
        if (board[0][2].equals(board[1][1]) && board[2][0].equals(board[0][2]) && !board[0][2].equals(".")) {
            return board[0][0];
        }
        return "no winner";
    }

}




