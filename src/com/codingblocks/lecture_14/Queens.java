package com.codingblocks.lecture_14;

public class Queens {
    public static void main(String[] args) {
        int n = 8;
        boolean[][] board = new boolean[n][n];

        int c = nqueens(board, 0);

        System.out.println(c);
    }

    public static int nqueens(boolean[][] board, int row){
        if (row == board.length){
            display(board);
            return 1;
        }

        int sum = 0;

        for (int col = 0; col < board.length; col++) {
            if(safe(board, row, col)){
                board[row][col] = true;
                sum += nqueens(board, row + 1);
                board[row][col] = false;
            }
        }

        return sum;
    }

    public static boolean safe(boolean[][] board, int row, int col) {

        int  i = 1;
        while (row - i >= 0){
            if (board[row - i][col]){
                return false;
            }
            i++;
        }

        i = 1;
        while ((row - i) >= 0 && (col - i) >= 0){
            if (board[row - i][col-i]){
                return false;
            }
            i++;
        }

        i = 1;
        while ((row - i) >= 0 && (col + i) < board.length){
            if (board[row - i][col+i]){
                return false;
            }
            i++;
        }

        return true;

    }


    public static void display(boolean[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col]){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
