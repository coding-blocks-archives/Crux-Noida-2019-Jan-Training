package com.codingblocks.lecture_19.story;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start on petrol");
    }

    @Override
    public void stop() {
        System.out.println("Stop on petrol");
    }

    @Override
    public void acc(int n) {
        System.out.println("Acc with " + n);
    }
}
