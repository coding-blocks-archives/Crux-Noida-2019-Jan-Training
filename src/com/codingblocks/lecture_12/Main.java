package com.codingblocks.lecture_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        permutation("", "abc");

//        int[][][] nums = new int[3][4][4];
//
//        Scanner s = new Scanner(System.in);
//
//        boolean a = s.nextBoolean();
//        System.out.println("write some");
//        String b = s.nextLine();
//
////        s.next();
//        System.out.println("write more");
//
//        System.out.println(a + " " + b.length());

//        input(nums, s);
//
//        display(nums);

    }

    public static void input(int[][][] nums, Scanner s){

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = s.nextInt();
                }
            }
        }
    }

    public static void display(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void permutation(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < unprocessed.length(); i++) {
            permutation(processed + unprocessed.charAt(i),
                    unprocessed.substring(0, i)
                            + unprocessed.substring(i+1));
        }
    }
}
