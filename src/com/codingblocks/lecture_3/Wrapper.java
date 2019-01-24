package com.codingblocks.lecture_3;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
//        int a = 8;
//
//        Integer b = new Integer(7);
//
//
//        int d = Integer.parseInt("5467");
//
//
//        Integer c = null;
//
//        System.out.println(c);

        Scanner s = new Scanner(System.in);

        int first = Integer.parseInt(s.nextLine());
        char ch = s.nextLine().charAt(0);
        int second = Integer.parseInt(s.nextLine());


        if (ch == '*') {
            System.out.println(first * second);
        } else if (ch == '-') {
            System.out.println(first - second);
        } else if (ch == '+') {

        }

        switch (ch) {
            case '*':
                System.out.println(first * second);
                break;
            case '+':
                System.out.println(first + second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            default:
                System.out.println(first / second);

        }
    }


}
