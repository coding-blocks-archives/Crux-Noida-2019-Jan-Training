package com.codingblocks.lecture_26;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] one = {1, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9, 0, 2, 9};
        int[] two = {3, 4, 5, 6, 7};

        ArrayList<Integer> sum = sum(one, two);

        System.out.println(sum);
    }

    private static ArrayList<Integer> sum(int[] one, int[] two) {
        int o = one.length - 1;
        int t = two.length - 1;
        int carry  = 0;

        Integer[] res;

        ArrayList<Integer> list = new ArrayList<>();

        while (o >= 0 && t >= 0){
            int num = one[o] + two[t] + carry;
            list.add(0, num % 10);
            o--;
            t--;

            carry = num/10;
        }

        while (o >= 0){
            int num = one[o]+ carry;
            list.add(0, num % 10);
            o--;
            carry = num/10;
        }

        while (t >= 0){
            int num = two[t] + carry;
            list.add(0, num % 10);
            t--;
            carry = num/10;
        }

        if (carry > 0){
            list.add(0, carry);
        }

        return list;
    }
}
