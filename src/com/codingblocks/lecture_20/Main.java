package com.codingblocks.lecture_20;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {

            ThreadChacha sample = new ThreadChacha("Thread " + i, 5);

//            Runnable r = new RunnableSample();
//            Thread t = new Thread(r);
            sample.start();
        }

    }
}
