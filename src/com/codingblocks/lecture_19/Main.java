package com.codingblocks.lecture_19;

public class Main {
    public static void main(String[] args) {
        Teacher t = new MathTeacher();
        t.teach();
        t.study();

        TA ta = new CBTA();

        ta.play();
        ta.study();



    }
}
