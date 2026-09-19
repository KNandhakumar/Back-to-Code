package com.Nandhakumar.Problem_Solving.Basics;

public class ArmStrongNumber {
    // Armstrong number : https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
    public static void main(String[] args) {
        if (armstrongNumber(152)){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not armstrong number");
        }
    }

    static boolean armstrongNumber(int n) {
        int original = n;
        if (n<=0){
            return false;
        }
        int result = 0;
        while (n>0){
            int rem = n%10;
            result = (rem*rem*rem) + result;
            n/=10;
        }
        if (original==result){
            return true;
        }
        return false;
    }
}
