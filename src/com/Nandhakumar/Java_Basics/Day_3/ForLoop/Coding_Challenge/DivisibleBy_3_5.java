package com.Nandhakumar.Java_Basics.Day_3.ForLoop.Coding_Challenge;

public class DivisibleBy_3_5 {
    public static void main(String[] args) {
        // Question : Print the number which are divisible ny both 3 and 5. range 1 to 100
        for (int i = 1; i <= 100 ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
