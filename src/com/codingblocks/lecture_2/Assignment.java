package com.codingblocks.lecture_2;

public class Assignment {

    public static void main(String[] args) {

//        int n = 31;
//
//        int i = 2;
//
//
//        while (i * i <= n){
//            if(n % i == 0){
//                System.out.println("Not a prime");
//                return;
//            }
//
//            i = i+1;
//        }
//
//        System.out.println("Prime number");


        int n = 4564;

//        int d = 5;

        int odd = 0;
        int even = 0;

        while (n > 0){

            int r = n % 10;
            n = n/10;

            even = even + r;

            r = n % 10;
            n = n/10;

            odd = odd + r;


        }

        System.out.println(even);
        System.out.println(odd);
    }


}
