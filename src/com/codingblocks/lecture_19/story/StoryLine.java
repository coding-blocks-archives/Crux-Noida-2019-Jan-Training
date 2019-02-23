package com.codingblocks.lecture_19.story;

public class StoryLine {

    public static void main(String[] args) {
        NitroEngine nitro = new NitroEngine();

        Car c = new Car(nitro);

        c.start();
        c.stop();

        // you were defeated

        // change your engine

        PetrolEngine petrol = new PetrolEngine();

        c.upgradeEngine(petrol);

        c.start();
        c.stop();

//        Engine e = new NitroEngine();
//        e.start();
//        e.stop();
    }
}
