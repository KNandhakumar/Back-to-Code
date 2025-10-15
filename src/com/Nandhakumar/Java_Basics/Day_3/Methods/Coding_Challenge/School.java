package com.Nandhakumar.Java_Basics.Day_3.Methods.Coding_Challenge;

import java.util.Scanner;

public class School {
    String passOrFail(int mark){
        // ternary operator
        return mark>=35?"Pass":"Fail";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // create an object
        School school = new School();
        String result = school.passOrFail(in.nextInt());
        System.out.println(result);
    }
}
