package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.Basics;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n>0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n/=10;
        }
        return original == reverse;
    }
}
