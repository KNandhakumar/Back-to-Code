package com.Nandhakumar.Problem_Solving.Arrays.WeeklyRevise.WeeklyReviseArray;

import java.util.Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Better approach Time : O(n)
    public static void rotate(int[] arr) {
        // take last element
        int last = arr[arr.length-1];
        // rotating every element into right shift
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}
