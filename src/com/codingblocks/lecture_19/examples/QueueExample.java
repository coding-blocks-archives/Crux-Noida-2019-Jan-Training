package com.codingblocks.lecture_19.examples;


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(15);
        queue.add(25);

        System.out.println(queue);

        queue.remove();

        System.out.println(queue);

    }
}
