package com.codingblocks.lecture_18;

public class QueueClient {
    public static void main(String[] args) {
        Queue q = new DynamicQueue(3);

        for (int i = 0; i < 100000; i++) {
            q.insert(i);
        }

//        q.insert(1);
//        q.insert(2);
//        q.insert(3);
//
//        q.remove();
//
//        q.insert(4);
//        q.insert(5);

//        q.insert(35);
//        System.out.println(q);
//        q.insert(6);
//        System.out.println(q);
//        q.insert(37865);
//        System.out.println(q);
//        q.insert(735);
//        System.out.println(q);
//
//        q.remove();
//        System.out.println(q);
//        q.remove();
//        System.out.println(q);
//
//        q.insert(45);
//        System.out.println(q);
//
//
//        q.remove();
//        System.out.println(q);
//        q.remove();
//        System.out.println(q);

    }
}
