package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.Basics;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

    // Better approach O(sqrt(n))
    static boolean isPrime(int n) {
        // we know 0 and 1 it's not prime
        if (n<=1) return false;
        // i know 1 and n itself can divide a prime number, so
        // we only check sqrt of n because we know n divide possibilities have in sqrt n
        for (int i = 2; i*i <= n ; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    // Brute force approach O(n)
    static boolean isPrime1(int n) {
        // we know 0 and 1 it's not prime
        if (n<=1) return false;
        // i know 1 and n itself can divide a prime number, so
        // check only 2 to n-1, in this range if its divide it's not a prime number
        for (int i = 2; i < n ; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
