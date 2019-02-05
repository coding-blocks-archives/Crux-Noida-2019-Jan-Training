package com.codingblocks.lecture_9;

public class Main {
    public static void main(String[] args) {
        pd4();
    }

    public static void pd4(){
        System.out.println(4);
        pd3();
        System.out.println("Getting back to 4");

    }

    public static void pd3(){
        System.out.println(3);
        pd2();
        System.out.println("Getting back to 3");

    }

    public static void pd2(){
        System.out.println(2);
        pd1();
        System.out.println("Getting back to 2");
    }

    public static void pd1(){
        System.out.println(1);
    }
}
