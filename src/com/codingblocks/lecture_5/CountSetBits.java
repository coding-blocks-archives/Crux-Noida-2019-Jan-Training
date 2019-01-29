package com.codingblocks.lecture_5;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int val = s.nextInt();

            int bit = setBits(val);

            System.out.println(bit);

        }
    }

    public static int setBits(int num){
        int counter = 0;

        while (num > 0){
            if ((num & 1) == 1){
                counter++;
            }

            num = num >> 1;
        }

        return counter;
    }
}
