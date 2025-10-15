package com.Nandhakumar.Java_Basics.Day_3.Methods.Coding_Challenge;

import java.util.Scanner;

public class Find {
    void evenOrOdd(int num){
        if (num%2==0){
            System.out.println(num + " is even number");
        }
        else {
            System.out.println(num + " is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // create an object for Find class to access the methods and fields
        Find findEvenOrOdd = new Find();
        findEvenOrOdd.evenOrOdd(in.nextInt());
    }
}
