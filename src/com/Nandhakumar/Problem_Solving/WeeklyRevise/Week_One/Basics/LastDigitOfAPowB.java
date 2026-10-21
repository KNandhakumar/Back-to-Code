package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.Basics;

public class LastDigitOfAPowB {
    public static void main(String[] args) {
        String a = "3";
        String b = "10";
        System.out.println(getLastDigit1(a,b));
    }
    public static int getLastDigit(String a, String b) {
        // we need to get a last digit of a
        int base = a.charAt(a.length()-1) - '0';
        // now find b % 4 because 4 cycles
        int rem = 0;

        // Step 2: Find b % 4 / find the exponent using b
        for (int i = 0; i < b.length(); i++) {
            rem = (rem*10+b.charAt(i) - '0') % 4;
        }

        // step 3 : if rem = 0 we need to change rem = 4 because 3^4 = 81 so in cycles one is 4th place
        if (rem == 0){
            rem = 4;
        }
        // checking cycles
        int[][] cycles = {
                {0},
                {1},
                {2, 4, 8, 6},
                {3, 9, 7, 1},
                {4, 6},
                {5},
                {6},
                {7, 9, 3, 1},
                {8},
                {9, 1},
        };
        return cycles[base][(rem-1) % cycles[base].length];
    }

    public static int getLastDigit1(String a, String b) {
        // take string a last digit
        int base = a.charAt(a.length()-1) - '0';
        // b % 10
        int rem = 0;
        for (int i = 0; i < b.length(); i++) {
            rem = (rem*10+b.charAt(i) - '0') % 4;
        }
        return (int) Math.pow(base,rem);
    }

    // if incase string values are high we cant get a value into int or long datatype it'll overflow
    public static int getLastDigit2(String a, String b) {
        // get string into integer
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        // now n1 power n2
        return (int) Math.pow(n1,n2)%10;
    }
}
