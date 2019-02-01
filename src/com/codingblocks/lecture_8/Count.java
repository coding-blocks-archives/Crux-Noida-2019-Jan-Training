package com.codingblocks.lecture_8;

import com.codingblocks.lecture_4.Sorting;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {

        String line = "ccaabb";

        String res =countSortString(line);

        System.out.println(res);

//        int[] nums = new int[100000];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = (int)(Math.random() * 100000);
//        }

//        Arrays.sort(nums);

//        countSort(nums, 100000);


//        Sorting.bubble(nums);

//        StringBuilder builder = new StringBuilder();
//
//        for (int i = 0; i < nums.length; i++) {
//            builder.append(nums[i]);
//            builder.append(" ");
//        }

//        System.out.println(Arrays.toString(nums));

//        int[] d = sort01(nums);
//
//        for (int i = 0; i < d.length; i++) {
//            System.out.print(d[i] + " ");
//        }
    }

    public static int[] sort01(int[] nums){
        int zeros =0;
        int ones = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zeros++;
            } else {
                ones++;
            }
        }

        int[] res = new int[nums.length];

        for (int i = 0; i < res.length; i++) {
            if (i < zeros){
                res[i] = 0;
            } else {
                res[i] = 1;
            }
        }

        return res;
    }

    public static void countSort(int[] nums, int d){
        int[] feq = new int[d+1];

        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            feq[v]++;
        }

        int pos = 0;

        for (int i = 0; i < feq.length; i++) {
            for (int j = 0; j < feq[i]; j++) {
                nums[pos++] = i;
            }
        }
    }

    public static String countSortString(String line){
        int[] feq = new int[26];

        for (int i = 0; i < line.length(); i++) {
            int v = line.charAt(i) - 'a';
            feq[v]++;
        }

//        System.out.println(Arrays.toString(feq));

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < feq.length; i++) {
            for (int j = 0; j < feq[i]; j++) {
                builder.append((char)(i+'a'));
            }
        }

        return builder.toString();

    }
}
