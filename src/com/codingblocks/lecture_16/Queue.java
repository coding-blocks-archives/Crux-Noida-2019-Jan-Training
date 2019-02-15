package com.codingblocks.lecture_16;

import java.util.ArrayList;

public class Queue {

    private ArrayList<Integer> data;

    public Queue(){
        this.data = new ArrayList<>();
    }

    public void insert(int value){
        this.data.add(value);
    }

    public int remove(){
        return this.data.remove(0);
    }

    public int front(){
        return this.data.get(0);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    public void display(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            builder.append(data.get(i));
            builder.append(", ");
        }

        builder.append("END");

        System.out.println(builder);
    }

}
