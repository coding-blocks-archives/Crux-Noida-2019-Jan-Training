package com.codingblocks.lecture_1;

public class Fibo {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        int n = 7;

        while (n > 0){
            System.out.println(first);

            int temp = second;
            second = first + second;
            first = temp;

            n = n-1;

        }
    }
}
