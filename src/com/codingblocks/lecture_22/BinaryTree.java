package com.codingblocks.lecture_22;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void populate(Scanner scanner){
        this.root = populate(root, scanner);
    }

    private Node populate(Node node, Scanner scanner) {
        if (node == null){
            System.out.println("Enter value to be added");
            int value = scanner.nextInt();
            return new Node(value);
        }

        System.out.println("Current node is " + node.value);

        System.out.println("Do you want to add left or right");
        boolean isLeft = scanner.nextBoolean();

        if (isLeft){
            node.left = populate(node.left, scanner);
        } else {
            node.right = populate(node.right, scanner);
        }

        return node;
    }

    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
