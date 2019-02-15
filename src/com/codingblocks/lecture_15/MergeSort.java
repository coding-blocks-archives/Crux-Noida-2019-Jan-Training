package com.codingblocks.lecture_15;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] f = {1, 5, 7};
        int[] s = {2, 4, 6};

        System.out.println(Arrays.toString(merge(f, s)));

    }

    public static int[] mergesort(int[] nums){
        if (nums.length <= 1){
            return nums;
        }

        int mid = nums.length/2;

        int[] first = Arrays.copyOfRange(nums, 0, mid);
        int[] second = Arrays.copyOfRange(nums, mid, nums.length);

        first = mergesort(first);
        second = mergesort(second);

        return merge(first, second);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] res = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                res[k++] = first[i++];
            } else {
                res[k++] = second[j++];
            }
        }

        while (i < first.length){
            res[k++] = first[i++];
        }

        while (j < second.length){
            res[k++] = second[j++];
        }

        return res;

    }
}
