package com.codingblocks.lecture_32;

public class Main {
    public static void main(String[] args) {
        AdjListGraph<Integer> graph = new AdjListGraph<>();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1, 2);
        graph.addEdge(3, 4);

//        graph.display();

        System.out.println(graph.connectedComponentsList());
    }
}
