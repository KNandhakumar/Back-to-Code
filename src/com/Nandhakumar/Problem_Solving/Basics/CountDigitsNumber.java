package com.Nandhakumar.Problem_Solving.Basics;

public class CountDigitsNumber {
    // Count Digits in Number : https://www.geeksforgeeks.org/problems/count-total-digits-in-a-number/1
    public static void main(String[] args) {
        System.out.println(countDigits(1567));
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n>0){
            count++;
            n/=10;
        }
        return count;
    }
}
