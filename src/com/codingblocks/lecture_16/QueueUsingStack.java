package com.codingblocks.lecture_16;

public class QueueUsingStack {
    private Stack data;

    public QueueUsingStack(){
        data = new Stack();
    }

    public void insert(int value){
        data.push(value);
    }

    public int remove(){
        Stack temp = new Stack();

        while (!data.isEmpty()){
            temp.push(data.pop());
        }

        int v = temp.pop();

        while (!temp.isEmpty()){
            data.push(temp.pop());
        }

        return v;
    }

    public int front(){
        Stack temp = new Stack();

        while (!data.isEmpty()){
            temp.push(data.pop());
        }

        int v = temp.top();

        while (!temp.isEmpty()){
            data.push(temp.pop());
        }

        return v;
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }
}
