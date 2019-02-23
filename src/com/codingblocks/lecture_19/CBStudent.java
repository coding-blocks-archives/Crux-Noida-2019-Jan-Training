package com.codingblocks.lecture_19;

public class CBStudent implements Student{
    @Override
    public void study() {
        System.out.println("Study like a CB Student");
    }

    @Override
    public void play() {
        System.out.println("Play like a CB Student");
    }
}
