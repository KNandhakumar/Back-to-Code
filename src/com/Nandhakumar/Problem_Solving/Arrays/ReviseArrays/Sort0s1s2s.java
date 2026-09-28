package com.Nandhakumar.Problem_Solving.Arrays.ReviseArrays;

import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int[] arr) {
        // assume all are zeros because we put all counts into this variables
        int zero = 0;
        int one = 0;
        int two = 0;
         for (int num : arr){
             if (num == 0) zero++;
             else if (num == 1) one++;
             else two++;
         }
         // put elements ascending order
         int index = 0;
        // for 0's
         while (zero > 0){
             arr[index] = 0;
             index++;
             zero--;
         }
        // for 1's
        while (one > 0){
            arr[index] = 1;
            index++;
            one--;
        }
        // for 2's
        while (two > 0){
            arr[index] = 2;
            index++;
            two--;
        }
    }
}
