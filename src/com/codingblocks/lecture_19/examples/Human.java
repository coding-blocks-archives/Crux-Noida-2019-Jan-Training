package com.codingblocks.lecture_19.examples;

public class Human implements Comparable<Human> {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
