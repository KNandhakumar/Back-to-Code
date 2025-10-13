package com.Nandhakumar.Java_Basics.Day_2.If_Else.Questions_Practice;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args){
        // Question : Get input for variable Mami. if mami > 35 print pass. else print fail
        // get input from user
        Scanner in = new Scanner(System.in);
        int mami = in.nextInt();
        // if mami mark is greater than 35, she is pass
        // if not she is fail
        if (mami>=35){
            System.out.println("Mami you are pass");
        }
        else {
            System.out.println("You are fail");
        }
    }
}
