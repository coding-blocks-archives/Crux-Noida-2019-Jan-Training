package com.codingblocks.lecture_11;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int c = diceCount("", 3);

        System.out.println(c);

//        Set<String> set = new HashSet<>();
//
//        System.out.println(subseqUnique("", "aba", set));
    }

    public static int subseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            return 1;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        int sum = 0;

        sum += subseq(processed + ch, unprocessed);
        sum += subseq(processed, unprocessed);

        return sum;
    }

    public static int subseqUnique(String processed, String unprocessed, Set<String> set){
        if (unprocessed.isEmpty()){
            if (processed.isEmpty() || set.contains(processed)){
                return 0;
            } else {
                set.add(processed);
                return 1;
            }
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        int sum = 0;

        sum += subseqUnique(processed + ch, unprocessed, set);
        sum += subseqUnique(processed, unprocessed, set);

        return sum;
    }

    public static int diceCount(String processed, int target){
        if (target == 0){
            return 1;
        }

        int sum = 0;

        for (int i = 1; i <=6 && i <= target; i++) {
            sum += diceCount(processed + i, target - i);
        }

        return sum;
    }
}
