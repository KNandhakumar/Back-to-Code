package com.Nandhakumar.Problem_Solving.Arrays.WeeklyRevise;

public class RaiseToPowerItsOwnReverse {
    public static void main(String[] args) {
        System.out.println(reverseExponentiation(10));
    }

    public static int reverseExponentiation(int n) {
        int original = n;
        int reverse = 0;
        while(n>0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n/=10;
        }
        return (int) Math.pow(original,reverse);
    }
}
