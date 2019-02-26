package com.codingblocks.lecture_20;

public class LinkedList {

    private Node head;

    public void insertFirst(String value){
        Node node = new Node(value);
        node.next  = head;
        head = node;
    }

    public void insertLast(String value){
        if(head == null){
            insertFirst(value);
            return;
        }

        Node temp = head;

        // grab tail in temp
        while (temp.next != null){
            temp = temp.next;
        }

        // create new node
        Node node = new Node(value);

        // append it to tail
        temp.next = node;
    }

    public void insert(String value, int index){
        if (index == 0){
            insertFirst(value);
            return;
        }

        Node prev = head;

        // grab prev in temp ref
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        Node node = new Node(value, prev.next);
        prev.next = node;
    }

    public String removeFirst(){
        if (head == null){
            return null;
        }

        String value = head.value;
        head = head.next;
        return value;
    }

    public String removeLast(){
        if (head == null || head.next == null){
            return removeFirst();
        }

        Node prev = head;

        //reach second last item
        while (prev.next.next != null){
            prev = prev.next;
        }

        // grab value of item to be deleted
        String value = prev.next.value;

        // delete last item
        prev.next = null;

        return value;
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    private class Node {
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
