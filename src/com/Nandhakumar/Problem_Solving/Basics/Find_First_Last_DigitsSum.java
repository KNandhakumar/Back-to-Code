package com.Nandhakumar.Problem_Solving.Basics;

public class Find_First_Last_DigitsSum {
    // Find first and last digits sum : https://www.geeksforgeeks.org/problems/corner-digits1317/1
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(cornerDigitSum(n));
    }

    // Optimize approach Time : O(1)
    public static int cornerDigitSum(int n) {
        int digits = (int)Math.log10(n);
        int first = n / (int)Math.pow(10,digits);
        int last = n%10;
        return first + last;
    }

    // Optimize approach Time - O(logn)
    public static int cornerDigitSum1(int n) {
        String s = Integer.toString(n);
        int first = (s.charAt(0) - '0');
        int last = (s.charAt(s.length()-1) - '0');
        return first + last;
    }

    // Optimize approach Time - O(logn)
    public static int cornerDigitSum2(int n) {
        String s = Integer.toString(n);
        int first = Character.getNumericValue(s.charAt(0));
        int last = Character.getNumericValue(s.charAt(s.length()-1));
        return first + last;
    }

    // Brute force approach
    public static int findFirstLastDigitSum(int n) {
        int last = n%10;
        while (n>=10){
            n = n/10;
        }
        int first = n;
        return first+last;
    }
}
