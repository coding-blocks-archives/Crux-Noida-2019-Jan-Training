package com.codingblocks.lecture_9;

import com.codingblocks.lecture_3.ArrayIntroduction;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRec {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//
//        int a = s.nextInt();
//        String l = s.nextLine();
//        l = s.nextLine();
//
//
//        System.out.println(a);
//        System.out.println(l);


//        String[] temp = s.nextLine().split(" ");
//
//        int[] nums = new int[temp.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = Integer.parseInt(temp[i]);
//        }
//
//        System.out.println(Arrays.toString(nums));



//        pattern(4, 0);

        System.out.print("hello");
        System.out.println("\b\b");
////
        int[] nums = {2, 4, 5, 8, 6, 4};

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            builder.append(nums[i]);
            if (i < nums.length - 1) {
                builder.append(", ");
            }
        }

        System.out.println(builder);
//
//        bubble(nums, nums.length - 1, 0);
//
//        ArrayIntroduction.display(nums);
//
//        System.out.println(findIndex(nums, 0, 4));
    }

    public static boolean find(int[] nums, int index, int target) {
        if (nums.length == index) {
            return false;
        }

        boolean present = nums[index] == target;

        return present || find(nums, index + 1, target);

    }

    public static boolean sorted(int[] nums, int index) {
        if (index == nums.length - 1) {
            return true;
        }

        if (nums[index] > nums[index + 1]) {
            return false;
        }

        return sorted(nums, index + 1);
    }

    public static int findIndex(int[] nums, int index, int target) {
        if (index == nums.length) {
            return -1;
        }

        if (nums[index] == target) {
            return index;
        }

        return findIndex(nums, index + 1, target);
    }

    // {2, 4, 5, 8, 6, 4};

    public static int count(int[] nums, int index, int target) {
        if (index == nums.length) {
            return 0;
        }

        int c = count(nums, index + 1, target);

        if (nums[index] == target) {
            c = c + 1;
        }

        return c;

    }

    public static void pattern(int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){
            System.out.println();
            pattern(row - 1, 0);
            return;
        }

        System.out.print("* ");
        pattern(row, col + 1);
    }

    public static void bubble(int[] nums, int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){
            bubble(nums, row - 1, 0);
            return;
        }

        // compare and swap
        if (nums[col] > nums[col + 1]){
            ArrayIntroduction.swap(nums, col, col + 1);
        }

        bubble(nums, row, col + 1);
    }

}
