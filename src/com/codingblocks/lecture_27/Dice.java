package com.codingblocks.lecture_27;

public class Dice {

    public static void main(String[] args) {

    }

    public static int dice(int target, int face){
        if (target == 0){
            return 1;
        }

        int sum = 0;

        for (int i = 1; i <= face && i <= target ; i++) {
            sum+= dice(target-i, face);
        }

        return sum;
    }

    public static int diceDP(int target, int face, Integer[] memory){
        if (target == 0){
            return 1;
        }

        if (memory[target] != null){
            return memory[target];
        }

        int sum = 0;

        for (int i = 1; i <= face && i <= target ; i++) {
            sum+= diceDP(target-i, face, memory);
        }

        memory[target] = sum;

        return sum;
    }


    public static int diceDPItr(int target, int face){
        Integer[] memory = new Integer[target + 1];

        for (int t = 0; t <= target ; t++) {
            if (t == 0){
                memory[t] = 1;
            } else {
                int sum = 0;
                for (int i = 1; i <= face && i <= t ; i++) {
                    sum+= memory[t-i];
                }
                memory[t] = sum;
            }
        }

        return memory[target];
    }
}
