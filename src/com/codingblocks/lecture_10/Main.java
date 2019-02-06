package com.codingblocks.lecture_10;

public class Main {
    public static void main(String[] args) {

//        System.out.println(diceCount(20));
        numpad("", "12");
    }

    public static void subseq(String processed, String unprocessed){

        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        // accept first char
        subseq(processed + ch, unprocessed);

        // reject first char
        subseq(processed, unprocessed);
    }

    public static void permutation(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);

            permutation(first + ch + second, unprocessed);
        }
    }

    public static void dice(String processed, int target){
        if (target == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(processed + i, target - i);
        }
    }



    public static int diceCount(int target){
        if (target == 0){
            return 1;
        }

        int sum = 0;

        for (int i = 1; i <= 6 && i <= target ; i++) {
            sum += diceCount(target - i);
        }

        return sum;
    }

    public static void numpad(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int d = Integer.parseInt(unprocessed.substring(0, 1));
//        int d = unprocessed.charAt(0) - '0';

        unprocessed = unprocessed.substring(1);

        for (int i = 3 * (d-1); i < 3 * d; i++) {

            if (i == 26){
                break;
            }

            char ch = (char)('a' + i);
            numpad(processed + ch, unprocessed);
        }




    }
}
