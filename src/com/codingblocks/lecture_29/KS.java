package com.codingblocks.lecture_29;

public class KS {
    public static void main(String[] args) {
        int[] p = {5, 1, 7};
        int[] w = {4, 1, 3};

        System.out.println(knapsack(w, p, w.length, 5));
    }

    public static int knapsack(int[] w, int[] p, int len, int cap){
        if (cap == 0 || len == 0){
            return 0;
        }

        // ask for mam

        int accept = 0;

        if (w[len-1] <= cap){
            accept = p[len-1] + knapsack(w, p, len - 1, cap - w[len - 1]);
        }

        int reject = knapsack(w, p, len - 1, cap);

        int val = Math.max(accept, reject);


        // save in mem

        return val;
    }
}
