package com.Nandhakumar.Problem_Solving.Basics.ReviseBasics;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(floorSqrt(11));
    }

    // using while loop
    static int floorSqrt(int n) {
        int i = 1;
        while (i*i <= n){
            i++;
        }
        return i-1;
    }

    static int floorSqrt1(int n) {
        int count = 0;
        for (int i = 1; i*i <= n ; i++) {
            count++;
        }
        return count;
    }

    // using for loop
    static int floorSqrt2(int n) {
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if (i*i <= n){
                count++;
            }
        }
        return count;
    }

    // using in build method
    static int floorSqrt3(int n) {
        return (int) Math.sqrt(n);
    }
}
