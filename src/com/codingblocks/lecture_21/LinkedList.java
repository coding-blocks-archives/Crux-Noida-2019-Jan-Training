package com.codingblocks.lecture_21;

public class LinkedList {

    private Node head;

    public void insertFirst(String value){
        Node node = new Node(value, head);
        head = node;
    }

    private Node tail(){

        if(head == null){
            return null;
        }

        Node tail = head;

        while (tail.next != null){
            tail = tail.next;
        }

        return tail;
    }

    public void insertLast(String value){
        if (head == null){
            insertFirst(value);
            return;
        }

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        Node node = new Node(value);
        temp.next = node;
    }

    public void insert(String value, int index){
        if (index == 0){
            insertFirst(value);
            return;
        }

        Node prev = head;

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

        // reach second last
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }

        // grab value of last
        String value = temp.next.value;

        // point second last to null
        temp.next = null;

        return value;
    }

    public String remove(int index){
        if (index == 0){
            return removeFirst();
        }

        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        String value = prev.next.value;

        prev.next = prev.next.next;

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



    private class Node{
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
