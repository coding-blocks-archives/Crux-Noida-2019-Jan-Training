package com.codingblocks.lecture_31;

import java.util.ArrayList;

public class MapWithAL <K, V> {

    private ArrayList<Node> array = new ArrayList<>();

    public MapWithAL() {
        for (int i = 0; i < 100; i++) {
            array.add(null);
        }
    }

    public V get(K key){
        int index = Math.abs(key.hashCode()) % array.size();

        Node node = array.get(index);

        if (node != null && node.key.equals(key)){
            return node.value;
        } else {
            return null;
        }
    }

    public void put(K key, V value){
        int index = Math.abs(key.hashCode()) % array.size();

        Node node = new Node(key, value);

        array.set(index, node);
    }

    public V remove(K key){
        int index = Math.abs(key.hashCode()) % array.size();

        Node node = array.get(index);

        if (node != null && node.key.equals(key)){
            array.set(index, null);
            return node.value;
        } else {
            return null;
        }
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
