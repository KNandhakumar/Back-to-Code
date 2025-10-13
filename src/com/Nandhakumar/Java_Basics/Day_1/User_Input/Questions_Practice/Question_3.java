package com.Nandhakumar.Java_Basics.Day_1.User_Input.Questions_Practice;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        // Get input for 3 integer variables : a, b, c. now multiply all variables and store it in d
        // now add all variables and store it in e. now divide by d by e
        Scanner in = new Scanner(System.in); // initialize scanner class
        int a = in.nextInt(); // initialize a variable
        int b = in.nextInt(); // initialize b variable
        int c = in.nextInt(); // initialize c variable
        int d = a*b*c; // multiply 3 variables then store the value in d
        int e = a+b+c; // add 3 variables then store the values in e
        System.out.println("d : " + d); // printing d value
        System.out.println("e : " + e); // printing e value
        System.out.println(d/e); // printing d divide e
    }
}
