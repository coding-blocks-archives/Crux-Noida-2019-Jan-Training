package com.codingblocks.lecture_20;

public class Client {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("mohit");
        list.display();
        list.insertFirst("pooja");
        list.display();

        list.insertLast("mohini");
        list.insertLast("amit");
        list.insertLast("neha");

        list.display();

        list.insert("richa", 5);
        list.display();

        list.removeFirst();

        list.display();
    }
}
