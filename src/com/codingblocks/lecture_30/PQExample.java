package com.codingblocks.lecture_30;

import java.util.PriorityQueue;

public class PQExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priority = new PriorityQueue<>();

        priority.add(12);
        priority.add(34);
        priority.add(121);
        priority.add(1);


        System.out.println(priority.remove());
        System.out.println(priority.remove());


        priority.add(7);

        System.out.println(priority.remove());
        System.out.println(priority.remove());


    }
}
