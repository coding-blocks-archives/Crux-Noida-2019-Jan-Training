package com.codingblocks.lecture_31;

import java.util.LinkedList;

public class MapWithLL<K, V> {

    private LinkedList<Node> list = new LinkedList<>();

    public V get(K key){
        for (Node node : list) {
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public void put(K key, V value){
        for (Node node : list) {
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));
    }

    public V remove(K key){

        Node target = null;

        for (Node node : list) {
            if (node.key.equals(key)){
                target = node;
            }
        }

        list.remove(target);

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
