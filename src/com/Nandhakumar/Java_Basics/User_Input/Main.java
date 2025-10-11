package com.Nandhakumar.Java_Basics.User_Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner class used to get users inputs
        Scanner in = new Scanner(System.in);
        String name = in.next();
        int age = in.nextInt();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
