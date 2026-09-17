package com.Nandhakumar.Problem_Solving.Basics;

public class CountAndDivideDigits {
    // Find digits in N that divide it : https://www.geeksforgeeks.org/problems/count-digits-in-given-number-n-which-divide-n3331/1
    public static void main(String[] args) {
        System.out.println(divisibleByDigits("1122324"));
    }

    // Brute force approach Time : 0(n2)
    public static int divisibleByDigits(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit !=0 && isDivisible(s,digit)){
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
        return rem ==0;
    }

    // Brute force approach
    // its good approach but we cant do like this because in case string value will high we cant change into integer
    public static int divisibleByDigits1(String s) {
        int original = Integer.parseInt(s);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit!=0 && original % digit == 0){
                count++;
            }
        }
        return count;
    }
}
