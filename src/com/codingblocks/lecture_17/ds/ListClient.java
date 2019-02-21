package com.codingblocks.lecture_17.ds;

public class ListClient {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        System.out.println(list);
    }
}
