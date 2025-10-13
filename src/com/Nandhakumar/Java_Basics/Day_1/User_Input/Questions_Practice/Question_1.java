package com.Nandhakumar.Java_Basics.Day_1.User_Input.Questions_Practice;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        // Get input for variable : Name, Age print it
        Scanner in = new Scanner(System.in);
        String name = in.next();
        int age = in.nextInt();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
