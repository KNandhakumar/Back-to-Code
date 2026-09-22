package com.Nandhakumar.Problem_Solving.Arrays;

import java.util.Arrays;

public class Sort0s1s2s {
    // Sort 0s, 1s and 2s : https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int[] arr) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        // count the 0's. 1's, 2's
        for (int num : arr){
            if (num == 0) zeros++;
            else if (num == 1) ones++;
            else twos++;
        }

        // put values into sorting order
        int index = 0;
        // for 0's
        while (zeros>0){
            arr[index] = 0;
            index++;
            zeros--;
        }
        // for 1's
        while (ones>0){
            arr[index] = 1;
            index++;
            ones--;
        }
        // for 2's
        while (twos>0){
            arr[index] = 2;
            index++;
            twos--;
        }
    }

    // Brute force approach Time : O(n2)
    public static void sort0121(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
