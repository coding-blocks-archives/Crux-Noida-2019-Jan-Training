package com.codingblocks.lecture_18;

public class Stack {

    private int[] data;
    private int top;

    private static final int DEFAULT_SIZE = 10;

    public Stack(){
        this.data = new int[DEFAULT_SIZE];
        this.top = -1;
    }

    public boolean push(int value){
        if (isFull()){
            return false;
        }

        this.data[++this.top] = value;
        return true;
    }

    public int pop() throws IndexOutOfBoundsException{
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Removing from empty");
        }

        return this.data[this.top--];
    }

    public int top() throws IndexOutOfBoundsException {

        if (isEmpty()){
            throw new IndexOutOfBoundsException("Finding top from empty");
        }

        return this.data[this.top];
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public boolean isFull(){
        return this.top == this.data.length - 1;
    }

}
