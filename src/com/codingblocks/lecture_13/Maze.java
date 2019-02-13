package com.codingblocks.lecture_13;

public class Maze {

    public static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {

        int m = 4;
        int n = 4;

        boolean[][] maze = new boolean[m][n];

        maze[0][0] = true;


        int c = mazeAllPath("", maze, 0, 0, m-1, n-1);

        System.out.println(c);
    }

    public static int maze(int row, int col){
        if (row == 1 && col == 1){
            return 1;
        }

        int sum = 0;

        if (row > 1){
            sum += maze(row - 1, col);
        }

        if (col > 1){
            sum += maze(row, col - 1);
        }

        return sum;
    }



    public static int mazeD(int row, int col){
        if (row == 1 && col == 1){
            return 1;
        }

        int sum = 0;

        if (row > 1){
            sum += mazeD(row - 1, col);
        }

        if (col > 1){
            sum += mazeD(row, col - 1);
        }

        if (row > 1 && col > 1){
            sum += mazeD(row - 1 , col - 1);
        }

        return sum;
    }

    public static void mazePrint(String path, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if (row > 1){
            mazePrint(path + "V", row - 1, col);
        }

        if (col > 1){
            mazePrint(path+"H", row, col-1);
        }
    }

    public static int mazeCount(boolean[][] maze, int c_r, int c_c, int t_r, int t_c){
        if (c_r == t_r && c_c == t_c){
            return 1;
        }

        if (!bound(maze, c_r, c_c, t_r, t_c)){
            return 0;
        }

        if (maze[c_r][c_c]){
            return 0;
        }

        maze[c_r][c_c] = true;

        int sum = 0;

        sum += mazeCount(maze, c_r - 1, c_c, t_r, t_c);
        sum += mazeCount(maze, c_r, c_c + 1, t_r, t_c);
        sum += mazeCount(maze, c_r + 1, c_c, t_r, t_c);
        sum += mazeCount(maze, c_r , c_c - 1, t_r, t_c);

        maze[c_r][c_c] = false;

        return sum;
    }

    public static int mazeAllPath(String path, boolean[][] maze, int c_r, int c_c, int t_r, int t_c){
        if (c_r == t_r && c_c == t_c){
            System.out.println(path);
            return 1;
        }

        if (!bound(maze, c_r, c_c, t_r, t_c)){
            return 0;
        }

        if (maze[c_r][c_c]){
            return 0;
        }

        maze[c_r][c_c] = true;

        int sum = 0;

        sum += mazeAllPath(path + "U", maze, c_r - 1, c_c, t_r, t_c);
        sum += mazeAllPath(path + "R", maze, c_r, c_c + 1, t_r, t_c);
        sum += mazeAllPath(path + "D", maze, c_r + 1, c_c, t_r, t_c);
        sum += mazeAllPath(path + "L", maze, c_r , c_c - 1, t_r, t_c);

        maze[c_r][c_c] = false;

        return sum;
    }

    public static boolean bound(boolean[][] maze, int c_r, int c_c, int t_r, int t_c) {
        return c_r >= 0 && c_r < maze.length && c_c >= 0 && c_c < maze[0].length;
    }


//    public static void print(String data){
//        builder.append(data);
//    }
//
//    public static void println(String data){
//        builder.append(data);
//        builder.append("\n");
//    }
//
//    public static void flush(){
//        System.out.println(builder);
//        builder = new StringBuilder();
//    }
}
