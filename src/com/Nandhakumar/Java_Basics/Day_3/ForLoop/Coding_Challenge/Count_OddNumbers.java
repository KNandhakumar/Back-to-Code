package com.Nandhakumar.Java_Basics.Day_3.ForLoop.Coding_Challenge;

public class Count_OddNumbers {
    public static void main(String[] args) {
        // Question : Count the odd number from 1 to 10
        int count = 0;
        for (int i = 0; i <=10 ; i++) {
            if (i%2==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
