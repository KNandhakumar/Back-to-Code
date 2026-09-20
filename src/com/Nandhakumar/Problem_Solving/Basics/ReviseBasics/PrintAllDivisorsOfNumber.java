package com.Nandhakumar.Problem_Solving.Basics.ReviseBasics;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisorsOfNumber {
    public static void main(String[] args) {
        System.out.println(getDivisors(20));
    }
    public static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n%i == 0){
                divisors.add(i);

                if (i != n/i){
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
}
