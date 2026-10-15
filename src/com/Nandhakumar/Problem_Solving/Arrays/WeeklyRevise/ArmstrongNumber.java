package com.Nandhakumar.Problem_Solving.Arrays.WeeklyRevise;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }

    static boolean armstrongNumber(int n) {
        int result = 0;
        // take original number
        int original = n;
        // take each digit using modulo
        while(n>0){
            int rem = n%10;
            result = (rem*rem*rem) + result;
            n/=10;
        }
        return original == result;
    }
}
