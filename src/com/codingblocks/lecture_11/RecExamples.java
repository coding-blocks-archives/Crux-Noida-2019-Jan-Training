package com.codingblocks.lecture_11;

public class RecExamples {
    public static void main(String[] args) {
        int v = removeHiNotT("", "hitman hit the hi car");

        System.out.println(v);
    }

    public static void duplicates(String processed, String unprocessed){
        if (unprocessed.length() <=1 ){
            System.out.println(processed+unprocessed);
            return;
        }

        if (unprocessed.charAt(0) == unprocessed.charAt(1)){
            duplicates(processed, unprocessed.substring(1));
        } else {
            duplicates(processed + unprocessed.charAt(0), unprocessed.substring(1));
        }
    }


    public static int removeHi(String processed, String unprocessed){
        if (unprocessed.length() <=1 ){
            System.out.println(processed+unprocessed);
            return 0;
        }

        if (unprocessed.charAt(0) == 'h' && unprocessed.charAt(1) == 'i'){
            return 1 + removeHi(processed, unprocessed.substring(2));
        } else {
            return removeHi(processed + unprocessed.charAt(0), unprocessed.substring(1));
        }
    }

    public static int removeHiNotT(String processed, String unprocessed){
        if (unprocessed.length() <=1 ){
            System.out.println(processed+unprocessed);
            return 0;
        }

        if (unprocessed.charAt(0) == 'h' && unprocessed.charAt(1) == 'i'){
            if (unprocessed.length() >= 3 && unprocessed.charAt(2) == 't') {
                return removeHiNotT(processed + unprocessed.charAt(0), unprocessed.substring(1));
            } else {
                return 1 + removeHiNotT(processed, unprocessed.substring(2));
            }
        } else {
            return removeHiNotT(processed + unprocessed.charAt(0), unprocessed.substring(1));
        }
    }
}
