package com.codingblocks.lecture_16;

public class Main {
    public static void main(String[] args) {

//        int[] nums = new int[10];
//
//        nums.length = 20;

        Human dua = new Human("Dua", 22, 4000);

        dua.money = -10000;

        System.out.println(Human.population);

//        dua.name = "Dua";
//        dua.age = 22;

        System.out.println(dua.name);
        System.out.println(dua.age);

        System.out.println(dua.money);

        for (int i = 0; i < 40; i++) {
            dua.udhaar(100);
        }

        System.out.println(dua.money);

        Human akshay = new Human();

        System.out.println(Human.population);

        System.out.println(akshay.money);
    }
}
