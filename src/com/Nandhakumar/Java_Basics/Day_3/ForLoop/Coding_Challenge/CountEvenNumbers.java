package com.Nandhakumar.Java_Basics.Day_3.ForLoop.Coding_Challenge;

public class CountEvenNumbers {
    public static void main(String[] args) {
        // Question : Count even numbers from 1 to 10
        int count = 0;
        for (int i = 1; i <= 10 ; i++) {
            if (i%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
