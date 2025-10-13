package com.Nandhakumar.Java_Basics.Day_2.If_Else.Questions_Practice;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        // Question : Get a input for a number and find it is even or odd number
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num%2==0){
            System.out.println(num + " this is even number");
        }
        else {
            System.out.println(num + " this is odd number");
        }
    }
}
