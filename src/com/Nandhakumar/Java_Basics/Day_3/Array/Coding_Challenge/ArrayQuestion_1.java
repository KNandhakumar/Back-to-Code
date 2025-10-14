package com.Nandhakumar.Java_Basics.Day_3.Array.Coding_Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestion_1 {
    public static void main(String[] args) {
        // Question : Get input for 5 numbers using array and for loop
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
