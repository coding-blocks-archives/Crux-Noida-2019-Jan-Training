package com.codingblocks.lecture_31;

import java.util.ArrayList;
import java.util.Collections;

public class MinHeap <T extends Comparable<T>> {

    private ArrayList<T> list = new ArrayList<>();

    private int parent(int index){
        return (index-1)/2;
    }

    private int left(int index){
        return (index*2) + 1;
    }
    private int right(int index){
        return (index*2) + 2;
    }

    public void insert(T item){
        list.add(item);

        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if (index == 0){
            return;
        }

        if (list.get(index).compareTo(list.get(parent(index))) < 0){
            Collections.swap(list, index, parent(index));
            upheap(parent(index));
        }
    }

    public T remove(){
        T value = list.get(0);

        T last = list.remove(list.size() - 1);

        if (list.size() > 0){
            list.set(0, last);
            downheap(0);
        }

        return value;
    }

    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(left).compareTo(list.get(min)) < 0){
            min = left;
        }

        if (right < list.size() && list.get(right).compareTo(list.get(min)) < 0){
            min = right;
        }

        if (index != min){
            Collections.swap(list, index, min);
            downheap(min);
        }

    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
