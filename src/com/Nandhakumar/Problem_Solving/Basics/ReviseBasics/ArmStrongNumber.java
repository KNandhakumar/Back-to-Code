package com.Nandhakumar.Problem_Solving.Basics.ReviseBasics;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }

    static boolean armstrongNumber(int n) {
        int original = n;
        int check = 0;
        if (n<=0){
            return false;
        }
        while (n>0){
            int rem = n%10;
            check = (rem*rem*rem) + check;
            n/=10;
        }
        return original == check;
    }
}
