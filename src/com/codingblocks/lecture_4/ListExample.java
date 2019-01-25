package com.codingblocks.lecture_4;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);

        list.add(3);
        list.add(7);
        list.add(3);
        list.add(7);

        list.remove(new Integer(7));
//
//        list.remove(0);
//
//        int num = list.get(0);

//        list.set(0, 6);

        System.out.println(list.size());

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
