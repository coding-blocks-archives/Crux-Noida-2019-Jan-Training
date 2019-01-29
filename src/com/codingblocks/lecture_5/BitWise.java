package com.codingblocks.lecture_5;

import java.util.Scanner;

public class BitWise {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 5, 7, 1, 3, 5};

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        int val = distinct(nums);

        System.out.println(val);
    }

    public static int distinct(int[] nums){
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }

        return res;
    }
}
