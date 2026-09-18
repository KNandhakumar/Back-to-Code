package com.Nandhakumar.Problem_Solving.Basics;

public class GCDOfTwo {
    // GCD of Two : https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
    public static void main(String[] args) {
        System.out.println(gcd(20,28));
    }

    public static int gcd(int a, int b) {
        while (b>0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}
