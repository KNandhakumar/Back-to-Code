package com.Nandhakumar.Java_Basics.Day_3.Do_whileLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Do while loop
        Scanner in = new Scanner(System.in);
        int count = 0;
        do {
            // code to be executed at least once
            System.out.print("Enter the number < 10 : ");
            count = in.nextInt();
        } while (count<10);
    }
}
