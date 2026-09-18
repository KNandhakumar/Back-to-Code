package com.Nandhakumar.Problem_Solving.Basics;

public class ReverseNumber {
    // Reverse number : https://www.geeksforgeeks.org/problems/reverse-digit0316/1
    public static void main(String[] args) {
        System.out.println(reverseDigits(12345));
    }

    public static int reverseDigits(int n) {
        int reverse = 0;
        while (n>0){
            int rem = n%10;
            reverse = (reverse*10+rem);
            n/=10;
        }
        return reverse;
    }
}
