package com.codingblocks.lecture_22;

public class LinkedListGeneric<T extends Comparable<T>> {

    private Node head;

    public void insertFirst(T value){
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

    public void insertLast(T value){
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

    public void insert(T value, int index){
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

    public T removeFirst(){
        if (head == null){
            return null;
        }

        T value = head.value;
        head = head.next;

        return value;
    }

    public T removeLast(){
        if (head == null || head.next == null){
            return removeFirst();
        }

        // reach second last
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }

        // grab value of last
        T value = temp.next.value;

        // point second last to null
        temp.next = null;

        return value;
    }

    public T remove(int index){
        if (index == 0){
            return removeFirst();
        }

        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        T value = prev.next.value;

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

    public int size(){
        int s = 0;
        Node node = head;
        while (node != null){
            s++;
            node = node.next;
        }
        return s;
    }

    public void bubble(){
        int size = size();

        for (int i = 0; i < size; i++) {
            Node temp = head; // reset to index zero

            for (int j = 0; j < size - i - 1; j++) {
                Node first = temp;
                Node second = temp.next;

                // swap if needed
                if (first.value.compareTo(second.value) > 0){
                    T local = first.value;
                    first.value = second.value;
                    second.value = local;
                }

                temp = temp.next; // increment to next index
            }
        }
    }

    public T mid(){
        Node fast = head;
        Node slow = head;

        if(head == null){
            return null;
        }

        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.value;
    }

    public T kLast(int k){
        Node front = head;
        Node back = head;

        for (int i = 0; i < k; i++) {
            front = front.next;
        }

        while (front != null){
            front = front.next;
            back = back.next;
        }

        return back.value;
    }

    public LinkedListGeneric<T> createCopy(){
        LinkedListGeneric<T> list = new LinkedListGeneric<>();
        list.head = this.head;

        return list;
    }

    public T common(LinkedListGeneric<T> list){
        int s1 = this.size();
        int s2 = list.size();

        Node first = this.head;
        Node second = list.head;


        int diff = Math.abs(s1 - s2);

        for (int i = 0; i < diff; i++) {
            if (s1 > s2){
                first = first.next;
            } else {
                second = second.next;
            }
        }

        while (first != null && second != null){
            if (first == second){
                return first.value;
            }

            first = first.next;
            second = second.next;
        }

        return null;
    }

    private class Node{
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;

        }
    }

}
