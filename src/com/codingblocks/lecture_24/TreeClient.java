package com.codingblocks.lecture_24;

public class TreeClient {
    public static void main(String[] args) {
        BinarySearchTreeBalancing tree = new BinarySearchTreeBalancing();

//        int[] nums = new int[1000000];

//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = i;
//        }

//        tree.generateFromSorted(nums);

        for (int i = 0; i < 40; i++) {
            tree.add(i);
        }

        tree.inOrder();

        System.out.println(tree.height());


//        tree.display();
    }
}
