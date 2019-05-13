package com.codingblocks.lecture_30;

import com.codingblocks.lecture_20.LinkedList;

import java.util.ArrayList;
import java.util.Comparator;

public class Greedy {

    public static void main(String[] args) {

        ArrayList<Node> list = new ArrayList<>();


        list.sort(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                 double res = o1.density - o2.density;
                 if (res < 0){
                     return 1;
                 } else if (res > 0){
                     return -1;
                 } else {
                     return 0;
                 }
            }
        });
    }

    public static class Node {
        private double price;
        private double weight;

        private double density;

        public Node(double price, double weight) {
            this.price = price;
            this.weight = weight;

            this.density = price/ weight;
        }
    }
}
