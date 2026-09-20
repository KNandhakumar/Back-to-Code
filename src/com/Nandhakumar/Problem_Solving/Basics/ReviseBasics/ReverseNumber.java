package com.Nandhakumar.Problem_Solving.Basics.ReviseBasics;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseDigits(12345));
    }

    public static int reverseDigits(int n) {
        int reverse = 0;
        while (n>0){
            int rem = n % 10;
            reverse = reverse*10+rem;
            n/=10;
        }
        return reverse;
    }
}
