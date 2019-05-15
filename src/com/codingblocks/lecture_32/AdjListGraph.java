package com.codingblocks.lecture_32;


import java.util.*;

public class AdjListGraph <T extends Comparable<T>> {

    Map<T, Vertex> vertexMap = new HashMap<>();

    public void addVertex(T value){
        Vertex v = new Vertex(value);
        vertexMap.put(value, v);
    }

    public void addEdge(T start, T end){
        Vertex s = vertexMap.get(start);
        Vertex e = vertexMap.get(end);

        if (s != null && e != null){
            s.neighbours.add(e);
            e.neighbours.add(s);
        }
    }

    public void display(){
        for (Vertex vertex : vertexMap.values()) {
            System.out.print(vertex.value + " => ");

            for (Vertex padosi : vertex.neighbours) {
                System.out.print(padosi.value + "  ");
            }
            System.out.println();
        }
    }

    public void BFT(T value){
        Vertex start = vertexMap.get(value);

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()){
            Vertex front = queue.remove();
            System.out.println(front.value);

            for (Vertex padosi : front.neighbours) {
                if (!visited.contains(padosi)) {
                    queue.add(padosi);
                    visited.add(padosi);
                }
            }
        }

    }



    public void connectedComponents(){

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        for (Vertex start : vertexMap.values()) {

            if (visited.contains(start)){
                continue;
            }

            queue.add(start);
            visited.add(start);

            while (!queue.isEmpty()){
                Vertex front = queue.remove();
                System.out.print(front.value + " ");

                for (Vertex padosi : front.neighbours) {
                    if (!visited.contains(padosi)) {
                        queue.add(padosi);
                        visited.add(padosi);
                    }
                }
            }

            System.out.println();
        }

    }


    public LinkedList<LinkedList<T>> connectedComponentsList(){

        LinkedList<LinkedList<T>> components = new LinkedList<>();

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        for (Vertex start : vertexMap.values()) {

            if (visited.contains(start)){
                continue;
            }

            LinkedList<T> component = new LinkedList<>();

            queue.add(start);
            visited.add(start);

            while (!queue.isEmpty()){
                Vertex front = queue.remove();

                component.add(front.value);
                for (Vertex padosi : front.neighbours) {
                    if (!visited.contains(padosi)) {
                        queue.add(padosi);
                        visited.add(padosi);
                    }
                }
            }

            components.add(component);
        }

        return components;

    }


    public boolean bipart(){

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();
        Set<Vertex> red = new HashSet<>();
        Set<Vertex> green = new HashSet<>();



        for (Vertex start : vertexMap.values()) {

            if (visited.contains(start)){
                continue;
            }

            queue.add(start);
            visited.add(start);
            red.add(start);

            while (!queue.isEmpty()){
                Vertex front = queue.remove();

                for (Vertex padosi : front.neighbours) {
                    if (red.contains(front)) {
                        if (visited.contains(padosi)) {
                            if (red.contains(padosi)){
                                return false;
                            }
                        } else {
                            queue.add(padosi);
                            visited.add(padosi);
                            green.add(padosi);
                        }
                    }

                    if (green.contains(front)) {
                        if (visited.contains(padosi)) {
                            if (green.contains(padosi)){
                                return false;
                            }
                        } else {
                            queue.add(padosi);
                            visited.add(padosi);
                            red.add(padosi);
                        }
                    }
                }
            }

        }

        return true;

    }

    public int distance(T source, T target){
        Vertex start = vertexMap.get(source);

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        queue.add(start);
        queue.add(null);
        visited.add(start);

        int level = 0;

        while (!queue.isEmpty()){
            Vertex front = queue.remove();

            if (front == null){
                queue.add(null);
                level++;
                continue;
            }

            if (front.value.equals(target)){
                return level;
            }

            for (Vertex padosi : front.neighbours) {
                if (!visited.contains(padosi)) {
                    queue.add(padosi);
                    visited.add(padosi);
                }
            }
        }

        return -1;
    }

    public boolean BFS(T source, T target){
        Vertex start = vertexMap.get(source);

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()){
            Vertex front = queue.remove();

            if (front.value.equals(target)){
                return true;
            }

            for (Vertex padosi : front.neighbours) {
                if (!visited.contains(padosi)) {
                    queue.add(padosi);
                    visited.add(padosi);
                }
            }
        }

        return false;
    }


    public void DFT(T value){
        Vertex start = vertexMap.get(value);

        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();

        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()){
            Vertex front = stack.pop();
            System.out.println(front.value);

            for (Vertex padosi : front.neighbours) {
                if (!visited.contains(padosi)) {
                    stack.push(padosi);
                    visited.add(padosi);
                }
            }
        }

    }

    private class Vertex {

        private T value;
        private LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            neighbours = new LinkedList<>();
        }
    }
}
