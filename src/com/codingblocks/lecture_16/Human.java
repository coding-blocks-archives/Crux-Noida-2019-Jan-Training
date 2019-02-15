package com.codingblocks.lecture_16;

public class Human {

    public String name = "Faltu";
    public int age = 18;
    public int money = 1000;

    public static int population = 0;

    public Human(){
        Human.population = Human.population + 1;
    }

    public Human(String name, int age, int money){
        Human.population = Human.population + 1;
        this.name = name;
        this.age = age;

        this.money = money;
    }

    public void udhaar(){
        money = money - 100;
    }

    public int udhaar(int n){
        money = money - n;
        return money;
    }


}
