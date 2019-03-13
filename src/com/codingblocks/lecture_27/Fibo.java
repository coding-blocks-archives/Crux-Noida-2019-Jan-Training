package com.codingblocks.lecture_27;

public class Fibo {
    public static void main(String[] args) {

        int n = 50;
//
//        Integer[] memory = new Integer[n+1];
//
//        int res = fiboDP(n, memory);

        System.out.println(fiboDPItr(n));
    }

    public static int fibo(int n){
        if (n< 2){
            return n;
        }

        int sum = fibo(n-1) + fibo(n-2);

        return sum;
    }

    public static int fiboDP(int n, Integer[] memory){
        if (n< 2){
            return n;
        }

        if (memory[n] != null){
            return memory[n];
        }

        int sum = fiboDP(n-1, memory) + fiboDP(n-2, memory);

        memory[n] = sum;

        return sum;
    }

    public static int fiboDPItr(int n){
        Integer[] memory = new Integer[n+1];

        for (int i = 0; i <= n ; i++) {
            if (i < 2){
                memory[i] = i;
            } else {
                memory[i] = memory[i-1] + memory[i-2];
            }
        }

        return memory[n];
    }
}
