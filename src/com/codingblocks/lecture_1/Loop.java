package com.codingblocks.lecture_1;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /*int i = 1;


        while (i <= 10){
            System.out.println("Welcome to Coding Blocks");
            i = i + 1;
        }*/

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int row = 0;

        while (row < n){
            // do something
            int col = 0;

            while (col <= row){
                System.out.print("* ");
                col = col + 1;
            }

            System.out.println();

            row = row + 1;
        }

    }
}
