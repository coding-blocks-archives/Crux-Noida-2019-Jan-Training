package com.codingblocks.lecture_24;

public class TreeClient {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] nums = new int[1000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        tree.generateFromSorted(nums);


//        tree.display();
    }
}
