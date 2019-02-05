package com.codingblocks.lecture_9;

import java.math.BigInteger;

public class RecExamples {
    public static void main(String[] args) {
//        BigInteger f = factBig(10000);
//
//        System.out.println(f.toString().length());

        System.out.println(fibo(100));
    }

    public static void pd(int n){

        if (n <= 0){
            return;
        }

        System.out.println(n);

        pd(n-1);
    }

    public static void pi(int n){
        if (n <= 0){
            return;
        }

        pi(n-1);
        System.out.println(n);

    }


    public static void pdi(int n){
        if (n <= 0){
            return;
        }

        System.out.println(n);
        pdi(n-1);
        System.out.println(n);

    }

    public static void pdioddeven(int n){
        if (n == 0){
            return;
        }

        if (n%2 == 1){
            System.out.println(n);
        }

        pdioddeven(n-1);

        if (n%2 == 0){
            System.out.println(n);
        }
    }

    public static int fact(int n){

        if (n == 0){
            return 1;
        }

        return n * fact(n-1);
    }

    public static BigInteger factBig(int n){
        if (n == 0){
            return BigInteger.ONE;
        }

        BigInteger bign = new BigInteger(Integer.toString(n));

        return bign.multiply(factBig(n-1));
    }

    public static int pow(int x, int n){
        if (x == 0){
            return 0;
        }

        if (n == 0){
            return 1;
        }

        return x * pow(x, n-1);
    }

    public static int fibo(int n){

        if (n < 2){
            return n;
        }

        int second = fibo(n-1);

        int first = fibo(n- 2);

        return first + second;
    }
}
