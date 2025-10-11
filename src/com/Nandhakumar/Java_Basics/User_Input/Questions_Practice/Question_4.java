package com.Nandhakumar.Java_Basics.User_Input.Questions_Practice;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        // Get input for 3 variables : name, age, department.
        // let the user enter the score for 100 marks, you convert it for 10 and print it
        Scanner in = new Scanner(System.in);
        String name = in.next();
        double score = in.nextInt();
        String department = in.next();
        System.out.println("My Name is : " + name);
        System.out.println("My Score is : " + score/10);
        System.out.println("My Department is : " + department);
    }
}
