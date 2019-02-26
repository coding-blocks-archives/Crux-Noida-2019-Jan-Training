package com.codingblocks.lecture_20;

public class RunnableSample implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e){

        }
    }
}
