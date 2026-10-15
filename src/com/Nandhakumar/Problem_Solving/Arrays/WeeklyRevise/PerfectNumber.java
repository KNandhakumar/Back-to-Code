package com.Nandhakumar.Problem_Solving.Arrays.WeeklyRevise;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }

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
        return n == sum;
    }


    // Brute force approach O(n)
    static boolean isPerfect1(int n) {
        int sum = 0;
        // traverse from 1 to n
        for (int i = 1; i < n; i++){
            if (n%i == 0){
                sum+=i;
            }
        }
        return n == sum;
    }
}
