package com.codingblocks.lecture_11;

import java.util.ArrayList;
import java.util.Set;

public class RecList {
    public static void main(String[] args) {



        ArrayList<String> list = diceCount("", 3);

        System.out.println(list);

//        int c = diceCount("", 3);
//
//        System.out.println(c);

//        Set<String> set = new HashSet<>();
//
//        System.out.println(subseqUnique("", "aba", set));
    }

    public static ArrayList<String> subseqSimple(String line){
        ArrayList<String> list = new ArrayList<>();

        subseq("", line, list);

        return list;
    }

    public static void subseq(String processed, String unprocessed, ArrayList<String> list){
        if (unprocessed.isEmpty()){
            if (!processed.isEmpty() ) {
                list.add(processed);
            }
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        subseq(processed + ch, unprocessed, list);
        subseq(processed, unprocessed, list);

    }

    public static ArrayList<String> subseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){

            ArrayList<String> list = new ArrayList<>();

            if (!processed.isEmpty() ) {
                list.add(processed);
            }

            return list;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        ArrayList<String> list = new ArrayList<>();

        list.addAll(subseq(processed + ch, unprocessed));
        list.addAll(subseq(processed, unprocessed));

        return list;

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

//    public static int diceCount(String processed, int target){
//        if (target == 0){
//            return 1;
//        }
//
//        int sum = 0;
//
//        for (int i = 1; i <=6 && i <= target; i++) {
//            sum += diceCount(processed + i, target - i);
//        }
//
//        return sum;
//    }

    public static ArrayList<String> diceCount(String processed, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <=6 && i <= target; i++) {
            list.addAll(diceCount(processed + i, target - i));
        }

        return list;
    }
}
