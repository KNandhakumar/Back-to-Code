package com.Nandhakumar.Problem_Solving.Basics;

import java.util.Scanner;

public class PrimeNumber {
    // Prime Number : https://www.geeksforgeeks.org/problems/prime-number2314/1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (isPrime(n)){
            System.out.println(n + " " + "Prime");
        }
        else {
            System.out.println(n + " " + "Not prime");
        }
    }

    // Better approach O(sqr(n))
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i*i <= n ; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    // Brute force approach O(n)
    static boolean isPrime1(int n) {
        if (n<=1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
