package com.codingblocks.lecture_5;

import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];

        Scanner s = new Scanner(System.in);

        input(nums, s);

        display(nums);
    }

    public static void input(int[][] nums, Scanner s){
        for (int r = 0; r < nums.length; r++) {
            int[] row = nums[r];

            for (int c = 0; c < row.length; c++) {
                row[c] = s.nextInt();
            }
        }
    }

    public static void display(int[][] nums){
        for (int r = 0; r < nums.length; r++) {
            int[] row = nums[r];

            for (int c = 0; c < row.length; c++) {
                System.out.print(row[c] + " ");
            }

            System.out.println();
        }
    }
}
