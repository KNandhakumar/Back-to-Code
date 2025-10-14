package com.Nandhakumar.Java_Basics.Day_3.Nested_Forloop;

public class Main {
    public static void main(String[] args) {
        // In java, nested loop is essentially a loop that runs inside another loop.
        // each time the outer loop runs once, the inner loop runs completely from start to finish
        // Question :   * * *
        //              * * *
        //              * * *
        for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= 3 ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
