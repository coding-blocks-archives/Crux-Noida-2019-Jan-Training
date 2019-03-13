package com.codingblocks.lecture_26;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    public static int fibo(int n){
        if (n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static int fibo(int n, Integer[] memory){
        if (n<2){
            return n;
        }

        if (memory[n] != null){
            return memory[n];
        }

        memory[n] =  fibo(n-1, memory) + fibo(n-2, memory);

        return memory[n];
    }
}
