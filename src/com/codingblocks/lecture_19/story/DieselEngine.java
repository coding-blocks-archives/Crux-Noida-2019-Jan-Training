package com.codingblocks.lecture_19.story;

public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start on Diesel");
    }

    @Override
    public void stop() {
        System.out.println("Stop on Diesel");
    }

    @Override
    public void acc(int n) {

    }
}
