package com.Nandhakumar.Java_Basics.Day_3.Array.Coding_Challenge;

public class IntegerArray {
    public static void main(String[] args) {
        // example question : create an integer array, get input for 5 numbers and print their sum
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
