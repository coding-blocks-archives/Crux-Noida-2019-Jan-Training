package com.codingblocks.lecture_17;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car.music();

        Car car = new Car();
        car.start();
        car.stop();

        car.music();


        System.out.println(car.wheels);
        System.out.println(car.doors);
//
//
//        Maruti maruti = new Maruti();
//
//        maruti.start();
//        maruti.stop();
//
//        System.out.println(maruti.wheels);
//        System.out.println(maruti.doors);


        Car my_Car = new Maruti();

        Maruti.music();

        System.out.println(my_Car);

        System.out.println(my_Car.doors);
        System.out.println(((Maruti)(my_Car)).doors);

//        my_Car.music();

//        Audi m = (Audi)my_Car;

//        System.out.println(m);
//
//        my_Car.start();
//
//        my_Car.stop();
//
//        m.music();
//
//        Vehicle v = new Maruti();


        int s = sum("Anuj", 1, 2, 6, 5, 4, 3);
    }

    public static int sum(String name, int... nums){

        return 0;
    }

}
