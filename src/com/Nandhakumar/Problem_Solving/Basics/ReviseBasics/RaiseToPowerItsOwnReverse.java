package com.Nandhakumar.Problem_Solving.Basics.ReviseBasics;

public class RaiseToPowerItsOwnReverse {
    public static void main(String[] args) {
        System.out.println(reverseExponentiation(2));
    }

    public static int reverseExponentiation(int n) {
        return (int) Math.pow(n,reverseNum(n));
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
