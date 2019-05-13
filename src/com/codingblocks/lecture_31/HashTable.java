package com.codingblocks.lecture_31;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable<K, V> {

    private ArrayList<LinkedList<Node>> array = new ArrayList<>();

    private int factor = 2;

    private int count = 0;

    public HashTable() {
        for (int i = 0; i < 100; i++) {
            array.add(new LinkedList<>());
        }
    }

    public V get(K key){
        int index = Math.abs(key.hashCode()) % array.size();

        LinkedList<Node> list = array.get(index);

        for (Node node : list) {
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public void put(K key, V value){
        int index = Math.abs(key.hashCode()) % array.size();

        LinkedList<Node> list = array.get(index);

        for (Node node : list) {
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));
        count++;

//        if (count > array.size() * factor){
//            rehashing();
//        }
    }

    private void rehashing() {
        ArrayList<LinkedList<Node>> old = array;

        array = new ArrayList<>();
        count = 0;

        for (int i = 0; i < old.size() * 2; i++) {
            array.add(new LinkedList<>());
        }

        for (LinkedList<Node> list : array) {
            for (Node node: list) {
                put(node.key, node.value);
            }
        }
    }

    public V remove(K key){
        int index = Math.abs(key.hashCode()) % array.size();

        LinkedList<Node> list = array.get(index);

        Node target = null;

        for (Node node : list) {
            if (node.key.equals(key)){
                target = node;
            }
        }

        list.remove(target);
        count--;
        return target.value;
    }


    private class Node {
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
