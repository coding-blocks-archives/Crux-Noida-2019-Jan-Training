package com.codingblocks.lecture_20;

public class ThreadChacha extends Thread {

    private int sleeptime;

    public ThreadChacha(String name, int priority, int sleep_time){
        this.setName(name);
        this.setPriority(priority);

        this.sleeptime = sleep_time;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(this.getName() + " is running " + i);
                Thread.sleep(sleeptime);
            }
        } catch (Exception e){

        }
    }
}
