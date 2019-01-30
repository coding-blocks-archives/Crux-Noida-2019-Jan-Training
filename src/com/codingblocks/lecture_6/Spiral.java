package com.codingblocks.lecture_6;

public class Spiral {
    public static void main(String[] args) {
        int[][] nums = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}
        };

        int top = 0;
        int left = 0;
        int bottom = nums.length - 1;
        int right = nums[0].length - 1;

        while (top <= bottom && left <= right){

            // top row
            for (int c = left; c <= right && top <= bottom; c++) {
                System.out.print(nums[top][c] + " ");
            }
            top++;

            for (int r = top; r <= bottom && left <= right; r++) {
                System.out.print(nums[r][right] + " ");
            }
            right--;

            for (int c = right; c >= left && top <= bottom; c--) {
                System.out.print(nums[bottom][c] + " ");
            }
            bottom--;

            for (int r = bottom; r >= top && left <= right; r--) {
                System.out.print(nums[r][left] + " ");
            }
            left++;


        }
    }
}
