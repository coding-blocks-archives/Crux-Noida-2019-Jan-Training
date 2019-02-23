package com.codingblocks.lecture_19.story;

public class Car{

    private MusicPlayer music;
    private Engine engine;
    private Brake brake;

    public Car(){
        this.music = new BoshMusic();
        this.engine = new PetrolEngine();
        this.brake = new ABS();
    }

    public Car(Engine engine){
        this.music = new BoshMusic();
        this.engine = engine;
        this.brake = new ABS();
    }

    public void driftLeft(){
        // turn steering right
        this.brake.apply();
        // turn steering left
    }

    public void start() {
        this.engine.start();
    }

    public void stop() {
        this.brake.apply();
        this.engine.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }


    public void upgradeCar(Engine engine, MusicPlayer player, Brake brake){
        this.engine = engine;
    }
}
