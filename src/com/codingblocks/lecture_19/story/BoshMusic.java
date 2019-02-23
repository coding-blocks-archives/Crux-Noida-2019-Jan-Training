package com.codingblocks.lecture_19.story;

public class BoshMusic implements MusicPlayer{

    @Override
    public void start() {
        System.out.println("Play bosh music");
    }

    @Override
    public void stop() {
        System.out.println("Stop bosh music");
    }
}
