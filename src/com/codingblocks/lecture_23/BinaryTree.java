package com.codingblocks.lecture_23;

import com.codingblocks.lecture_3.ArrayIntroduction;
import com.codingblocks.lecture_3.Searching;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void add(Scanner s){
        this.root = add(this.root, s);
    }

    private Node add(Node node, Scanner s) {
        if (node == null){
            System.out.println("Enter value you want to add ");
            int value = s.nextInt();
            Node n = new Node(value);
            return n;
        }

        System.out.println("Enter true for left, false for right");

        boolean isLeft = s.nextBoolean();

        if (isLeft){
            node.left = add(node.left, s);
        } else {
            node.right = add(node.right, s);
        }

        return node;
    }

    public void display(){
        display("", this.root, "root");
    }

    private void display(String indent, Node node, String type) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type);

        display(indent +"\t", node.left, "left");
        display(indent +"\t", node.right, "right");
    }

    private void preOrder(Node node) {
        if (node == null){
            return;
        }

        System.out.println(node.value);

        preOrder(node.left);
        preOrder(node.right);
    }

    private int depth(Node node){
        if (node == null){
            return 0;
        }

        return Math.max(depth(node.left) , depth(node.right)) + 1;
    }

    public int diameter(){
        if (root == null){
            return 0;
        }

        return depth(root.left) + depth(root.right) + 1;
    }

    public boolean find(int target){
        return find(root, target);
    }

    private boolean find(Node node, int target) {
        if (node == null){
            return false;
        }

        if (node.value == target){
            return true;
        }

        return find(node.left, target) || find(node.right, target);
    }

    public void populateByPreIn(int[] pre, int[] in){
        this.root = populateByPreInRec(pre, in);
    }

    private Node populateByPreInRec(int[] pre, int[] in) {

        if (in.length == 0){
            return null;
        }

        int r_value = pre[0];

        int index = findIndex(in, r_value);


        int[] in_left = Arrays.copyOfRange(in, 0, index);
        int[] in_right = Arrays.copyOfRange(in, index + 1, in.length);

        int[] pre_left = Arrays.copyOfRange(pre, 1, index + 1);
        int[] pre_right = Arrays.copyOfRange(pre, index + 1, in.length);

        Node node = new Node(r_value);
        node.left = populateByPreInRec(pre_left, in_left);
        node.right = populateByPreInRec(pre_right, in_right);

        return node;
    }

    public int findIndex(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public void levelOrder(){

        if (root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){

            Node node = queue.remove();

            System.out.println(node.value);

            if (node.left != null){
                queue.add(node.left);
            }

            if (node.right != null){
                queue.add(node.right);
            }
        }
    }

    public void mirror(){
        mirror(root);
    }

    public BinaryTree copy(){
        BinaryTree second = new BinaryTree();

        second.root = copy(root);

        return second;
    }

    public BinaryTree copyMirror(){
        BinaryTree second = new BinaryTree();

        second.root = copyMirror(root);

        return second;
    }

    private Node copy(Node node) {
        if (node == null){
            return null;
        }

        Node t = new Node(node.value);
        t.left = copy(node.left);
        t.right = copy(node.right);

        return t;
    }

    private Node copyMirror(Node node) {
        if (node == null){
            return null;
        }

        Node t = new Node(node.value);
        t.left = copyMirror(node.right);
        t.right = copyMirror(node.left);

        return t;
    }

    private void mirror(Node node) {
        if (node == null){
            return;
        }

        Node t = node.left;
        node.left = node.right;
        node.right = t;

        mirror(node.left);
        mirror(node.right);
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
