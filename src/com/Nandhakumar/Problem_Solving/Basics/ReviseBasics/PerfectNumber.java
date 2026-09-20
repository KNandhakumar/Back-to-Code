package com.Nandhakumar.Problem_Solving.Basics.ReviseBasics;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }

    // Better approach O(sqr(n))
    static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i*i <= n ; i++) {
            if (n%i == 0){
                sum+=i;

                if (i != n/i && n != n/i){
                    sum+=n/i;
                }
            }
        }
        return sum == n;
    }

    // Brute force approach O(n)
    static boolean isPerfect1(int n) {
        int sum = 1;
        for (int i = 2; i < n ; i++) {
            if (n % i == 0){
                sum+=i;
            }
        }
        return sum == n;
    }
}
