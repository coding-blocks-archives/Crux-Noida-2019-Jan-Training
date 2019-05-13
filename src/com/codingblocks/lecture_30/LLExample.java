package com.codingblocks.lecture_30;

import java.util.LinkedList;

public class LLExample {
    public static void main(String[] args) {
        LinkedList<Integer> firsrt = new LinkedList<>();

        firsrt.add(12);
        firsrt.add(13);
        firsrt.add(14);

        System.out.println(firsrt);

        LinkedList<Integer> second  = (LinkedList<Integer>)firsrt.clone();


        System.out.println(second);

        firsrt.addFirst(1);
        second.addFirst(2);

        System.out.println(firsrt);
        System.out.println(second);

    }
}
