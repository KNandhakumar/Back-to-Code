package com.Nandhakumar.Problem_Solving.Arrays.ReviseArrays;

import java.util.HashMap;

public class FindRepeatedElements {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int[] freq = new int[arr.length];
        for (int num : arr){
            freq[num]++;

            if (freq[num] == 2){
                return num;
            }
        }
        return -1;
    }
}
