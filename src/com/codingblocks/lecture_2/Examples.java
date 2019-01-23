package com.codingblocks.lecture_2;

public class Examples {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;

        System.out.println(a);
        System.out.println(b);

//        int t = a;
//        a = b;
//        b = t;

        swap(a, b);

        System.out.println(a);
        System.out.println(b);
    }

    public static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;

    }
}
