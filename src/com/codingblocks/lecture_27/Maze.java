package com.codingblocks.lecture_27;

public class Maze {
    public static void main(String[] args) {

    }

    public static int maze(int row, int col){
        if (row==1 || col == 1){
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

    public static int mazeDPItr(int row, int col){
        Integer[][] mem = new Integer[row+1][col + 1];

        for (int r = 1; r <= row ; r++) {
            for (int c = 1; c <= col ; c++) {
                if (r==1 || c== 1){
                    mem[r][c] = 1;
                } else {
                    mem[r][c] = mem[r-1][c] + mem[r][c-1];
                }
            }
        }

        return mem[row][col];
    }

}
