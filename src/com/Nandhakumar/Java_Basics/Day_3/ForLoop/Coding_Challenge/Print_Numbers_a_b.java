package com.Nandhakumar.Java_Basics.Day_3.ForLoop.Coding_Challenge;

import java.util.Scanner;

public class Print_Numbers_a_b {
    public static void main(String[] args) {
        // Question : Get input for variable a and b, and print the number from a to b
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = in.nextInt();
        System.out.print("Enter b : ");
        int b = in.nextInt();
        for (int i = a; i <=b ; i++) {
            System.out.println(i);
        }
    }
}
