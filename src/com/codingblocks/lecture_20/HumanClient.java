package com.codingblocks.lecture_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class HumanClient {
    public static void main(String[] args) {
        Human mohit = new Human("Mohit", 40);
        Human sumit = new Human("Sumit", 25);
        Human rahut = new Human("Rahut", 20);
        Human raghav = new Human("Raghav", 30);

//        Human[] humans = {mohit, sumit, rahut, raghav};
        //        Arrays.sort(humans, (h1, h2) -> {
//            return -h1.getName().compareTo(h2.getName());
//        });

        ArrayList<Human> list = new ArrayList<>();

        list.add(mohit);
        list.add(sumit);
        list.add(raghav);
        list.add(rahut);

        Collections.sort(list, (h1, h2) -> h1.getAge() - h2.getAge());

        list.stream().filter((h) -> h.getAge() > 30).forEach((h) -> System.out.println(h.getName()));






    }
}
