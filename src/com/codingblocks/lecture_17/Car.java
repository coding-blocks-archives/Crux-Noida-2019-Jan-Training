package com.codingblocks.lecture_17;

public class Car extends Vehicle {

    public int wheels = 4;
    public int doors = 4;

    public void start(){
        System.out.println("Starting like generic Car" + wheels);

    }

    public void start(int speed){
        System.out.println("Starting like generic Car with speed " + speed);

    }

    public void stop(){
        System.out.println("Stopping like generic Car");
    }

    private void dance(){
        System.out.println("Take part in aaja nach le");
    }

    @Override
    public void acc() {

    }

    public static void music(){

        System.out.println("Chak dhoom dhoom");
    }
}
