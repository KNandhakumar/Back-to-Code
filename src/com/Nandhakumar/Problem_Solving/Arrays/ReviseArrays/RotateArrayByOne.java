package com.Nandhakumar.Problem_Solving.Arrays.ReviseArrays;

import java.util.Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr) {
        // code here
        int last = arr[arr.length-1];

        for (int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}
