package com.Nandhakumar.Problem_Solving.Basics;

public class RaiseToPowerItsOwnReverse {
    // Raise to Power of Its Own Reverse : https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
    public static void main(String[] args) {
        System.out.println(reverseExponentiation(3));
    }

    public static int reverseExponentiation(int n) {
        return (int)Math.pow(n,reverseNum(n));
    }

    public static int reverseNum(int n){
        int reverse = 0;
        while (n>0){
            int rem = n%10;
            reverse = (reverse*10+rem);
            n/=10;
        }
        return reverse;
    }
}
