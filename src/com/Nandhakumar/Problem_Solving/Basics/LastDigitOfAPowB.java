package com.Nandhakumar.Problem_Solving.Basics;

public class LastDigitOfAPowB {
    public static void main(String[] args) {
        // Last Digit of a^b : https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1
        String a = "5", b = "0";
        System.out.println(getLastDigit(a,b));
    }

    // Optimized approach
    public static int getLastDigit(String a, String b) {
        // we need to get a last digit of a
        int base = a.charAt(a.length()-1) - '0';
        // now find b % 4 because 4 cycles
        int rem = 0;

        // Step 2: Find b % 4 / find the exponent using b
        for (int i = 0; i < b.length(); i++) {
            rem = (rem*10+b.charAt(i) - '0') % 4;
        }

        // Step 3: If remainder is 0, use 4
        if (rem == 0){
            rem = 4;
        }

        // Step 4: Last-digit cycles
        int[][] cycles = {
                {0},
                {1},
                {2, 4, 8, 6},
                {3, 9, 7, 1},
                {4, 6},
                {5},
                {6},
                {7, 9, 3, 1},
                {8, 4, 2, 6},
                {9, 1}
        };

        return cycles[base][(rem-1) % cycles[base].length];
    }

    // Brute force approach
    // convert string to integer method
    public static int getLastDigit1(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        return (int)Math.pow(num1,num2) % 10;
    }
}
