package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Methods {


    public static void main(String[] args) {

        pattern(4);
        pattern(6);
        pattern(8);
        pattern(4);
        pattern(9);



        eat();

        int v = eatWithReturn();

        eatFruit(5);

        int c = sum(23, 456);

        System.out.println(c);

    }

    public static void eat(){
        System.out.println("yumm yumm");
    }

    public static int eatWithReturn(){
        System.out.println("yumm yumm and return");

        return 50;
    }

    public static void eatFruit(int val){
        System.out.println("eating" + val);
    }

    public static int sum(int a, int b){

        int c = a + b;

        return c;
    }

    public static void pattern(int n){

        int row = 0;

        while (row < n){
            // print spaces
            int col = 0;
            while (col < n - row - 1){
                System.out.print("  ");
                col++;
            }

            col = 0;
            int k = row + 1;
            while (col < 2 * row + 1){
                System.out.print(k + " ");

                if (col < row){
                    k++;
                } else {
                    k--;
                }
                col++;
            }

            System.out.println();
            row++;
        }
    }
}
