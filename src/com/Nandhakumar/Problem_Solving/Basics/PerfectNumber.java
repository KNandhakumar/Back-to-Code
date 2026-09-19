package com.Nandhakumar.Problem_Solving.Basics;

public class PerfectNumber {
    // Perfect number : https://www.geeksforgeeks.org/problems/perfect-numbers3207/1
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }

    // Brute force approach O(sqrt(n))
    static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i*i <= n ; i++) {
            if (n%i == 0){
                sum+=i;

                if (i != n/i && n != n/i){
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    // Brute force approach O(n)
    static boolean isPerfect1(int n) {
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if (n%i == 0){
                sum+=i;
            }
        }
        return n == sum;
    }
}
