package com.codingblocks.lecture_20;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 2; i++) {
//
//            ThreadChacha sample = new ThreadChacha("Thread " + i, Thread.NORM_PRIORITY, i*1000);
//
////            Runnable r = new RunnableSample();
////            Thread t = new Thread(r);
//            sample.start();
//        }

        for (int i = 0; i < 100; i++) {

            Thread temp = new Thread(() -> {
                System.out.println("Doing it");
            });

            temp.start();
        }






//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 10000; i++) {
//            Thread t = new PrimeThread(list, i);
//            t.start();
//        }

    }

    public static boolean isPrime(int n){

        if (n < 2){
            return false;
        }

        for (int i = 2; i*i <= n; i++) {
            if ( n % i == 0){
                return false;
            }
        }

        return true;
    }
}
