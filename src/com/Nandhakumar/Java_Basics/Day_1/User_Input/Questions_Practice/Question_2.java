package com.Nandhakumar.Java_Basics.Day_1.User_Input.Questions_Practice;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        // Get input for variable : Name, Age, Address print it
        Scanner nk = new Scanner(System.in);
        String name = nk.next();
        int age = nk.nextInt();
        String address = nk.next();
        System.out.println("Name : " + name); // kural
        System.out.println("Age : " + age); // 24
        System.out.println("Address : " + address); // kerala
    }
}
