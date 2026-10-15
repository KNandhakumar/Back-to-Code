package com.Nandhakumar.Problem_Solving.Arrays.WeeklyRevise;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisorsOfNumber {
    public static void main(String[] args) {
        System.out.println(getDivisors(20));
    }

    public static ArrayList<Integer> getDivisors(int n) {
        // put n divisors into result
        ArrayList<Integer> result = new ArrayList<>();
        // searching square root of n because don't need to search until n
        for (int i = 1; i*i <= n ; i++) {
            // checking condition
            if (n%i == 0){
                result.add(i);
                // checking that don't add same value
                // if got i=1 then automatically got another divisor that i=20; so, we don't need to search until n
                if (i != n/i){
                    result.add(n/i);
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    // Brute force approach O(n)
    public static ArrayList<Integer> getDivisors1(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if (n%i == 0) result.add(i);
        }
        return result;
    }
}
