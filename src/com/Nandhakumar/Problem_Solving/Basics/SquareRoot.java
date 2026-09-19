package com.Nandhakumar.Problem_Solving.Basics;

public class SquareRoot {
    // Square root : https://www.geeksforgeeks.org/problems/square-root/1
    public static void main(String[] args) {
        System.out.println(floorSqrt(11));
    }

    // another method using while loop
    static int floorSqrt(int n) {
        int i = 1;
        while (i*i <= n){
            i++;
        }
        return i-1;
    }

    // another method using for loop
    static int floorSqr1t(int n) {
        int count = 0;
        for (int i = 1; i*i <= n ; i++) {
            count++;
        }
        return count;
    }

    // another method using for loop
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
        return (int)Math.sqrt(n);
    }
}
