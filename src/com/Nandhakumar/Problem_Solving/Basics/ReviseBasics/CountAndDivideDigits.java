package com.Nandhakumar.Problem_Solving.Basics.ReviseBasics;

public class CountAndDivideDigits {
    public static void main(String[] args) {
        System.out.println(divisibleByDigits("35"));
    }

    public static int divisibleByDigits(String s){
        int count = 0;
        // take each digit from string s
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit != 0 && isDivisible(s,digit)){
                count++;
            }
        }
        return count;
    }

    public static boolean isDivisible(String s, int digit){
        int rem = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentDigit = s.charAt(i) - '0';
            rem = (rem*10+currentDigit) % digit;
        }
        return rem == 0;
    }
}
