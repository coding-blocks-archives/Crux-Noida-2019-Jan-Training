package com.codingblocks.lecture_16;

public class QueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.insert(12);
        queue.insert(5);
        queue.insert(3);

        queue.display();

        queue.remove();

        queue.display();

        queue.remove();

        queue.display();
    }
}
