package com.codingblocks.lecture_3;

public class ArrayIntroduction {
    public static void main(String[] args) {

//        int[] nums = new int[10];

        int[] nums = {12, 45, 3, 67, 8};

        int m = max(nums);

        System.out.println(m);

//        nums[0] = 7;
//
//        display(nums);

//        for (int i = 0; i < 10; i++) {
////            System.out.println(nums[i]);
//            nums[i] = i;
//
////            display(nums);
//        }

//        display(nums);
//
//        swap(nums, 5, 8);
//
//        display(nums);



//        System.out.println(nums[0]);
    }

    public static void display(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.printf(nums[i] + " ");
        }

        System.out.println();
    }

    public static void swap(int[] nums, int f, int s){
        int t = nums[f];
        nums[f] = nums[s];
        nums[s] = t;
    }

    public static int max(int[] nums){
        // consider first item as max item
        int m = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[m]){
                // if present item is bigger change m
                m = i;
            }
        }

        return m;
    }

}
