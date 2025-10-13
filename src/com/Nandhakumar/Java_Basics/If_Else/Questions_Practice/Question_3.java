package com.Nandhakumar.Java_Basics.If_Else.Questions_Practice;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args){
        // Question : Get input for variable income. if income is lesser than 10000 scholarship is
        // available. else not eligible for scholarship
        Scanner in = new Scanner(System.in);
        int income = in.nextInt();
        if (income<10000){
            System.out.println("eligible for Scholarship");
        }
        else {
            System.out.println("not eligible for scholarship");
        }
    }
}
