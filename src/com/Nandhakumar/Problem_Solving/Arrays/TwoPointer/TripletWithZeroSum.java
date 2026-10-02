package com.Nandhakumar.Problem_Solving.Arrays.TwoPointer;

import java.util.Arrays;

public class TripletWithZeroSum {
    // Check Triplet With 0 Sum : https://www.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr));
    }

    public static boolean findTriplets(int[] arr) {
        // sort the array
        Arrays.sort(arr);
        // traverse the array
        for (int i = 0; i < arr.length; i++) {
            // initialize two pointer
            int start = i+1;
            int end = arr.length-1;

            while (start < end){
                int sum = arr[i] + arr[start] + arr[end];
                if (sum == 0) return true;
                else if (sum > 0) end--;
                else start++;
            }
        }
        return false;
    }

    // Brute force approach Time : O(n3)
    public static boolean findTriplets1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) return true;
                }
            }
        }
        return false;
    }
}
