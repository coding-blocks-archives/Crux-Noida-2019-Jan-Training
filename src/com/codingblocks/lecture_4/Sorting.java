package com.codingblocks.lecture_4;

import com.codingblocks.lecture_3.ArrayIntroduction;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] nums = {4, 3, 1, 2, 0};

        int[] res  = inverse(nums);

        System.out.println(Arrays.toString(res));
    }

    public static void bubble(int[] nums){
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if(nums[j] > nums[j+1]){
                    ArrayIntroduction.swap(nums, j, j+1);
                }
            }
        }
    }

    public static void selection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int m = maxIndex(nums, 0, nums.length - i - 1);
            ArrayIntroduction.swap(nums, m, nums.length - i - 1);
        }
    }

    public static int maxIndex(int[] nums, int start, int end){
        int m = start;

        for (int i = start; i <= end ; i++) {
            if (nums[i] > nums[m]){
                m = i;
            }
        }

        return m;
    }

    public static void insertion(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (nums[j] < nums [j - 1]){
                    ArrayIntroduction.swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void reverse(int[] nums){
//        for (int i = 0; i < nums.length / 2; i++) {
//            ArrayIntroduction.swap(nums, i, nums.length - 1 - i);
//        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            ArrayIntroduction.swap(nums, left++, right--);
        }
    }

    public static int[] inverse(int[] nums){
        int[] res = new int[nums.length];

        for (int pos = 0; pos < nums.length; pos++) {
            int val = nums[pos];
            res[val] = pos;
        }

        return res;
    }

}
