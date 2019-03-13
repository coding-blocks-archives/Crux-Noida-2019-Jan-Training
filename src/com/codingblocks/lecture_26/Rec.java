package com.codingblocks.lecture_26;

public class Rec {
    public static void main(String[] args) {

    }

    public static boolean isPallin(int[] nums, int start, int end){
        if (start >= end){
            return true;
        }

        if (nums[start] == nums[end]){
            return isPallin(nums, start + 1, end-1);
        }

        return false;
    }
}
