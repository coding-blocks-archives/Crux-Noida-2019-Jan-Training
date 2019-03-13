package com.codingblocks.lecture_26;

public class Maze {
    public static void main(String[] args) {
        int row = 20;
        int col = 20;
        Integer[][] memory = new Integer[row+1][col+1];

        System.out.println(mazeDP(row, col, memory));
    }

    public static int maze(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        int sum = maze(row-1, col) + maze(row, col-1);

        return sum;
    }

    public static int mazeDP(int row, int col, Integer[][] memory){
        if (row == 1 || col == 1){
            return 1;
        }

        if (memory[row][col] != null){
            return memory[row][col];
        }

        int sum = mazeDP(row-1, col, memory) + mazeDP(row, col-1, memory);


        memory[row][col] = sum;
        return sum;
    }
}
