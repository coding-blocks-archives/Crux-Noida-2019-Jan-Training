package com.codingblocks.lecture_18;

public class Queue {
    protected int[] data;
    protected int front;
    protected int end;
    private int size;

    private static final int DEFAULT_SIZE = 10;

    public Queue(int n){
        this.data = new int[n];
        this.front = 0;
        this.end = -1;
        this.size = 0;
    }

    public Queue(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return this.data.length == this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean insert(int value){
        if (isFull()){
            return false;
        }

        end = (end + 1) % data.length;
        data[end] = value;
        size++;
        return true;
    }

    public int remove(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException();
        }

        int v = data[front];
        front = (front + 1) % data.length;
        size--;

        return v;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            builder.append(data[((front + i) % this.data.length)]);
            if (i < front + size - 1){
                builder.append(", ");
            }
        }

        return builder.toString();
    }
}
