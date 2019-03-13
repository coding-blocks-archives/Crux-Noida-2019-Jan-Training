package com.codingblocks.lecture_26;

public class Dice {
    public static void main(String[] args) {

        int target = 30;

        Integer[] memory = new Integer[target + 1];

        System.out.println(diceDP(30, 3, memory));
    }

    public static int dice(int target, int face){
        if (target == 0){
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= face && i<= target ; i++) {
            count += dice(target - i, face);
        }

        return count;
    }

    public static int diceDP(int target, int face, Integer[] memory){
        if (target == 0){
            return 1;
        }

        if (memory[target] != null){
            return memory[target];
        }

        int count = 0;
        for (int i = 1; i <= face && i<= target ; i++) {
            count += diceDP(target - i, face, memory);
        }

        memory[target] = count;

        return count;
    }
}
