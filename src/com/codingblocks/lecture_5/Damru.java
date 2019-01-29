package com.codingblocks.lecture_5;

import java.util.Scanner;

public class Damru {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int v_mirror = 0;

        int row = 0;

        while (v_mirror < (2 * n) + 1){

            int col = 0;
            while (col < row){
                System.out.print("  ");
                col++;
            }


            int h_mirror = 0;
            col = 0;
            while (h_mirror < (n - row) * 2 + 1){
                System.out.print(n - row - col + " ");

                if (h_mirror < n - row){
                    col++;
                } else {
                    col--;
                }

                h_mirror++;


            }

            if (v_mirror < n){
                row++;
            } else {
                row--;
            }

            v_mirror++;

            System.out.println();
        }
    }
}
