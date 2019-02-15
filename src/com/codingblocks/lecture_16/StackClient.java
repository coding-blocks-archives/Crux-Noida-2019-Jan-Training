package com.codingblocks.lecture_16;

public class StackClient {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(6);

        stack.display();
    }
}
