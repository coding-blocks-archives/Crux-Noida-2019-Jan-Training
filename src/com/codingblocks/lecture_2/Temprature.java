package com.codingblocks.lecture_2;

public class Temprature {
    public static void main(String[] args) {

        int start = 0;
        int end = 300;
        int step = 20;

        while (start <= end){
            float c = ((5f/9) * (start - 32));
            System.out.printf("%.2f \n", c);
            start = start + step;
        }

        System.out.println("happy");
    }
}
