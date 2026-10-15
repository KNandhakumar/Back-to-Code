package com.Nandhakumar.Problem_Solving.Arrays.WeeklyRevise;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(floorSqrt(4));
    }

    static int floorSqrt(int n) {
        int count = 0;
        for (int i = 1; i*i <= n ; i++) {
            count++;
        }
        return count;
    }

    static int floorSqrt1(int n) {
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if (i*i <= n) count++;
        }
        return count;
    }

    // in build approach O(log n)
    static int floorSqrt2(int n) {
        return (int) Math.sqrt(n);
    }
}
