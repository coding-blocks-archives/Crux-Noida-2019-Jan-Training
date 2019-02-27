package com.codingblocks.lecture_14;

import com.codingblocks.lecture_21.LinkedList;
import com.codingblocks.lecture_21.LinkedListGeneric;

public class Client {
    public static void main(String[] args) {
        LinkedListGeneric<Integer> list = new LinkedListGeneric<>();

        list.insertFirst(2);
        list.insertFirst(1);

        list.display();

        list.insertLast(3);

        list.display();

        list.insert(4, 2);
        list.display();

        list.remove(1);

        list.display();

        list.bubble();

        list.display();
    }
}
