package com.codingblocks.lecture_3;

public class Assignment {

    public static void main(String[] args) {
        int val = deci2bin(71);

        System.out.println(val);
    }

    public static int bin2deci(int bin){
        int deci = 0;
        int place = 1;

        while (bin > 0){
            int r = bin % 10;

            bin = bin / 10;

            deci = deci + r * place;

            place = place * 2;
        }

        return deci;
    }


    public static int any2deci(int any, int base){
        int deci = 0;
        int place = 1;

        while (any > 0){
            int r = any % 10;

            any = any / 10;

            deci = deci + r * place;

            place = place * base;
        }

        return deci;
    }

    public static int deci2bin(int deci){
        int bin = 0;
        int place = 1;

        while (deci > 0){
            int r = deci % 2;
            deci = deci / 2;

            bin = bin + (place * r);

            place = place * 10;
        }

        return bin;
    }

    public static int deci2any(int deci, int base){
        int any = 0;
        int place = 1;

        while (deci > 0){
            int r = deci % base;
            deci = deci / base;

            any = any + (place * r);

            place = place * 10;
        }

        return any;
    }

    public static int any2any(int value, int source, int target){

        int deci = any2deci(value, source);

        int result = deci2any(deci, target);

        return result;
    }
}
