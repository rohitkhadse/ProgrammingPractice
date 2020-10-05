package com.crackingthecoding;

import java.util.HashSet;

public class SudokuCheck {

    public static boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i<9 ; i++){
            for (int j = 0; j<9 ; j++){
                if (board[i][j] != '.') {
                    if (!seen.add("row"+i+board[i][j]) || !seen.add("col"+j+board[i][j])){
                        return false;
                    }
                    if (!seen.add("box"+((i/3)*3+(j/3))+board[i][j])){
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board =
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                 ,{'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                 ,{'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                 ,{'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                 ,{'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                 ,{'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                 ,{'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                 ,{'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                 ,{'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Your Sudoku is valid: "+isValidSudoku(board));

    }
}
