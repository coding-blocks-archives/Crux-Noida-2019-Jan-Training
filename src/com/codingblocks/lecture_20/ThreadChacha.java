package com.codingblocks.lecture_20;

public class ThreadChacha extends Thread {

    public ThreadChacha(String name, int priority){
        this.setName(name);
        this.setPriority(priority);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(this.getName() + " is running " + i);
                Thread.sleep(1);
            }
        } catch (Exception e){

        }
    }
}
