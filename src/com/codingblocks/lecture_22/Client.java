package com.codingblocks.lecture_22;

public class Client {
    public static void main(String[] args) {
        LinkedListGeneric<Integer> list1 = new LinkedListGeneric<>();

        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);

        list1.display();

        LinkedListGeneric<Integer> list2 = list1.createCopy();

        list2.display();

        list1.insertFirst(6);
        list2.insertFirst(7);

        list1.display();
        list2.display();
    }
}
