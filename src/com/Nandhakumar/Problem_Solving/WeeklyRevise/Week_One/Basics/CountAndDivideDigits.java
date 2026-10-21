package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.Basics;

public class CountAndDivideDigits {
    public static void main(String[] args) {
        System.out.println(divisibleByDigits("1122324"));
    }
    public static int divisibleByDigits(String s) {
        int count = 0;
        // take each digit from s
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            // checking if the digit is divisible count it
            // 0 will divide everything so we skip it
            if (digit != 0 && countDiv(s,digit)){
                count++;
            }
        }
        return count;
    }

    public static boolean countDiv(String s, int digit){
        int rem = 0;
        for (int i = 0; i < s.length(); i++) {
            // take current digit
            int currentDigit = s.charAt(i) - '0';
            rem = (rem*10+currentDigit) % digit;
        }
        return rem == 0;
    }

    // Brute force approach because we can't store high string integers into int or long datatype it'll overflow
    public static int divisibleByDigits1(String s) {
        // take string into integer
        int num = Integer.parseInt(s);
        // take each digit from s then check if it is divisible by num then count it
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit != 0 && num % digit == 0){
                count++;
            }
        }
        return count;
    }
}
