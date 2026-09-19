package com.Nandhakumar.Problem_Solving.Basics;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisorsOfNumber {
    //  Print all Divisors of a number : https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1
    public static void main(String[] args) {
        System.out.println(getDivisors(20));
    }

    // Optimized approach O(sqr(n))
    public static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        // searching square root of n because dont need to search until n
        for (int i = 1; i*i <= n ; i++) {
            // checking condition
            if (n%i == 0){
                divisors.add(i);

                // checking that dont add same value
                // if got i=1 then automatically got another divisor that i=20; so, we dont need to search until n
                if (i != n/i){
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    // Brute force O(n)
    public static ArrayList<Integer> getDivisors1(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                divisors.add(i);
            }
        }
        return divisors;
    }
}
