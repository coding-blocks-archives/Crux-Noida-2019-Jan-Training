package com.codingblocks.lecture_1;

import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {
        /*int i = 1;


        while (i <= 10){
            System.out.println("Welcome to Coding Blocks");
            i = i + 1;
        }*/

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int row = 0;

        int k = 0;

        while (k < 2 * n - 1){
            // do something


            // spaces
            int col = 0;
            while (col < n - row - 1){
                System.out.print("  ");
                col = col + 1;
            }


            // stars
            col = 0;
            while (col < 2 * row + 1){
                System.out.print("* ");
                col = col + 1;
            }

            System.out.println();

            if (k < n - 1){
                row = row + 1;
            } else {
                row = row - 1;
            }

            k = k + 1;
        }

    }
}
