package com.codingblocks.lecture_8;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        
        int d = s.nextInt();
        
        leftRotateTime(nums, d);

        System.out.println(Arrays.toString(nums));
    }

    public static void leftRotate(int[] nums, int d) {
        
        d = d % nums.length;
        
        int[] temp = new int[d];

        // copy first d items
        for (int i = 0; i < d; i++) {
            temp[i] = nums[i];
        }
        
        // move remaining items to first
        for (int i = d; i < nums.length; i++) {
            nums[i-d] = nums[i];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i + nums.length - d] = temp[i];
        }
    }

    public static void leftRotateTime(int[] nums, int d){

        d = d % nums.length;

        while (d-- > 0) {

            int t = nums[0];

            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }

            nums[nums.length - 1] = t;
        }
    }

    public static void rotateOptimised(int[] nums, int d){

        d = d  % nums.length;

        int gcd = (new BigInteger(Integer.toString(nums.length))).gcd(new BigInteger(Integer.toString(d))).intValue();

//        int gcd = 2;

        for (int i = 0; i < gcd; i++) {

            int t = nums[i];

            int j;

            for (j = i + gcd; j < nums.length; j+=gcd) {
                nums[j-gcd] = nums[j];
            }

            nums[j] = t;

        }
    }

    public static int gcd(int a, int b){
        int m = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if(a%i == 0 && b%i == 0){
                m = i;
            }
        }

        return m;
    }
}
