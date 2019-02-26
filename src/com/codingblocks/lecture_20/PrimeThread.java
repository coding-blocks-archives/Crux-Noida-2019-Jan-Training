package com.codingblocks.lecture_20;

import java.util.ArrayList;

public class PrimeThread extends Thread{

    private ArrayList<Integer> list;
    private int num;

    public PrimeThread(ArrayList<Integer> list, int num){
        this.list = list;
        this.num = num;
    }

    @Override
    public void run() {
        if (isPrime(num)){
            System.out.println(num);
        }
    }

    public boolean isPrime(int n){

        if (n < 2){
            return false;
        }

        for (int i = 2; i*i <= n; i++) {
            if ( n % i == 0){
                return false;
            }
        }

        return true;
    }
}
