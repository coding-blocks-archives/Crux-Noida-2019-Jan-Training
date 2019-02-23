package com.codingblocks.lecture_19;

public class MathTeacher implements Teacher {


    @Override
    public void teach() {
        System.out.println("Teach like a Math teacher");
    }

    @Override
    public void study() {
        System.out.println("Study like a Math teacher");

    }

    public void makeMath(){
        System.out.println("I am math inventor");
    }
}
