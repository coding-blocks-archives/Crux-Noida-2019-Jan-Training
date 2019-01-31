package com.codingblocks.lecture_7;

import javafx.util.Builder;

public class Examples {
    public static void main(String[] args) {

        String line = "mohan";

        System.out.println(ascii(line));


//        StringBuilder builder = new StringBuilder(line);
//
//
////        for (int i = 1; i < builder.length(); i+=2) {
////            builder.setCharAt(i, '_');
////        }
//
//        for (int i = 0; i < builder.length(); i++) {
//            builder.insert(i+1, "_");
//        }
//
////        for (int i = 0; i < 1000000; i++) {
////            builder.append("a");
////        }
//
//        System.out.println(builder);
    }


    public static String  toggle(String line){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 'a'+ 'A');
            } else if (ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - 'A' + 'a');
            }

            builder.append(ch);

        }

        return builder.toString();


    }

    public static String  odd_even(String line){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a'&& ch <= 'z')) {
                if (i % 2 == 0) {
                    ch = (char) (ch - 1);
                } else {
                    ch = (char) (ch + 1);
                }
            }

            builder.append(ch);

        }

        return builder.toString();


    }

    public static String ascii(String line){
        StringBuilder builder = new StringBuilder();


        builder.append(line.charAt(0));

        for (int i = 1; i < line.length(); i++) {

            char present = line.charAt(i);
            char prev = line.charAt(i-1);

            builder.append(Math.abs(present-prev));
            builder.append(present);
        }


        return builder.toString();


    }







}
