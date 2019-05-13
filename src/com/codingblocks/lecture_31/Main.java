package com.codingblocks.lecture_31;

import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] nums = {324, 546, 436, 657, 35};

        heapsort(nums);

        System.out.println(Arrays.toString(nums));

        //        MinHeap<Integer> heap = new MinHeap<>();
//
//        for (int i = 0; i < 10; i++) {
//            int rand = (int)(Math.random() * 10);
//            heap.insert(rand);
//        }
//
//        while (!heap.isEmpty()){
//            System.out.println(heap.remove());
//        }
    }

    public static void heapsort(int[] nums){
        MinHeap<Integer> heap = new MinHeap<>();

        for (int i = 0; i < nums.length; i++) {
            heap.insert(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = heap.remove();
        }
    }
}
