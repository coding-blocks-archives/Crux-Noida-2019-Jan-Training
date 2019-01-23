package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        System.out.println("नमस्ते 先生 Sarabjeet");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int row = 0;

        while (row < n){
            // print spaces
            int col = 0;
            while (col < n - row - 1){
                System.out.print("  ");
                col++;
            }

            col = 0;
            int k = row + 1;
            while (col < 2 * row + 1){
                System.out.print(k + " ");

                if (col < row){
                    k++;
                } else {
                    k--;
                }
                col++;
            }

            System.out.println();
            row++;
        }
    }
}
