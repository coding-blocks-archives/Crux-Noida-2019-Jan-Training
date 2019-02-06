package com.codingblocks.lecture_6;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);

        String line = "Hello";

        String second = "world";





        System.out.println(line.substring(1));
//

//
//        for (int i = 0; i < line.length(); i++) {
//            System.out.println(line.charAt(i));
//        }
//
//        char[] chars = line.toCharArray();






//        System.out.println(countPallin(line));

//        char[] mango = {'m', 'a', 'n'};
//
//        String s = new String(mango);
//
//        System.out.println(s);
//
//        String second = "world";
//
//        String result = line.concat(Integer.toString(1));
//
//        String r =  line + 1 + 1;

//        System.out.println(line.indexOf('o', 2));

//        System.out.println(line.startsWith("oh",1));

//        System.out.println(line.substring(1));

//        substrings(line);

    }

    public static void print(String line){
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }

    public static void swap(String x, String y){
        String t = x;
        x = y;
        y = t;
    }

    public static void substrings(String line){
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <=line.length(); j++) {
                System.out.println(line.substring(i, j));
            }
        }
    }


    public static boolean pallin(String line){

        line = line.toLowerCase();

        for (int i = 0; i < line.length()/2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - 1 - i)){
                return false;
            }
        }

        return true;
    }

    public static void allpallin(String line){
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <= line.length(); j++) {
                String sub = line.substring(i, j);
                if (pallin(sub)){
                    System.out.println(sub);
                }
            }
        }
    }

    public static int countPallin(String line){
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 & right < line.length()){
                if (line.charAt(left--) == line.charAt(right++)){
                    count++;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < line.length(); i++) {
            int left = i;
            int right = i+1;

            while (left >= 0 & right < line.length()){
                if (line.charAt(left--) == line.charAt(right++)){
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
