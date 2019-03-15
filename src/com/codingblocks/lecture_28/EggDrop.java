package com.codingblocks.lecture_28;

public class EggDrop {
    public static void main(String[] args) {

    }

    public static int eggDrop(int eggs, int floors){
        if (floors == 0){
            return 0;
        }

        if (eggs == 1){
            return floors;
        }

        int min = floors;

        for (int f = 1; f <= floors; f++) {
            int toota = eggDrop(eggs-1, f-1);
            int sabut = eggDrop(eggs, floors-f);

            int max = 1 + Math.max(toota, sabut);

            if (max < min){
                min = max;
            }
        }

        return min;
    }
}
