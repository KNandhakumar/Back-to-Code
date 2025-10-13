package com.Nandhakumar.Java_Basics.If_Else.Questions_Practice;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args){
        // Question : Get a input from user, for the variable called Discipline
        // if discipline is yes print (you can learn anything)
        // if no discipline print (you cannot learn)

        Scanner in = new Scanner(System.in);
        String discipline = in.next();
        if (discipline.equals("yes")){
            System.out.println("You can learn anything");
        }
        else {
            System.out.println("You cannot learn");
        }
    }
}
