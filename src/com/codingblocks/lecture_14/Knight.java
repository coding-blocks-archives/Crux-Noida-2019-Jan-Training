package com.codingblocks.lecture_14;

public class Knight {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];

        int c = knight(board, 0, 0, n);

        System.out.println(c);

        System.out.println(board[-1][-2]);
    }

    public static int knight(boolean[][] board, int row, int col, int n){
        if (n == 0){
            display(board);
            return 1;
        }

        if (row == board.length){
            return 0;
        }

        if (col == board.length){
            return knight(board, row + 1, 0, n);
        }

        int sum = 0;

        if (safe(board, row, col)){
            board[row][col] = true;
            sum += knight(board, row, col + 1, n-1);
            board[row][col] = false;
        }

        sum += knight(board, row, col + 1, n);

        return sum;
    }

    public static boolean safe(boolean[][] board, int row, int col) {

        if (inbounds(board, row - 1, col - 2) && board[row-1][col-2]){
            return false;
        }

        if (inbounds(board, row - 1, col + 2) && board[row-1][col+2]){
            return false;
        }

        if (inbounds(board, row - 2, col - 1) && board[row-2][col-1]){
            return false;
        }

        if (inbounds(board, row - 2, col + 1) && board[row-2][col+1]){
            return false;
        }

        return true;
    }

    private static boolean inbounds(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    public static void display(boolean[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col]){
                    System.out.print("K ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

}
