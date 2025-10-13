package com.Nandhakumar.Java_Basics.Day_2.If_Else.Questions_Practice;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        // Question : Get input for a number and check whether it is divisible by both 3 and 5.
        // if yes then print, the number is divisible by 3 and 5. print the number is not divisible by 3 and 5
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num%3==0 && num%5==0){
            System.out.println("number is divisible by 3 and 5");
        }
        else {
            System.out.println("number is not divisible by 3 and 5");
        }
    }
}
