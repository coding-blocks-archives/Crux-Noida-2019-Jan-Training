package com.codingblocks.lecture_19.story;

public class NitroEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start on Nitro");
    }

    @Override
    public void stop() {
        System.out.println("Stop on Nitro");
    }

    @Override
    public void acc(int n) {
        System.out.println("Acc with " + (n*4));
    }

}
