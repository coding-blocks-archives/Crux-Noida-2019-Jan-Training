package com.codingblocks.lecture_19.examples;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object mohit = new Human("Mohit", 24);
        Object ajeet = new Human("Ajeet", 30);
        Object rohit = new Human("Rohit", 15);


        Object[] humans = {mohit, ajeet, rohit};

        Arrays.sort(humans);

        System.out.println(Arrays.toString(humans));

        int a = ((Human) mohit).getAge();

        System.out.println(a);
    }
}
