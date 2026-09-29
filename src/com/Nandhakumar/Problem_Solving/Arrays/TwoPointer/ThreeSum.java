package com.Nandhakumar.Problem_Solving.Arrays.TwoPointer;

import java.util.Arrays;

public class ThreeSum {
    // Triplet Sum in Array : https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;
        System.out.println(hasTripletSum(arr,target));
    }

    // Optimize approach Time : O(n2)
    public static boolean hasTripletSum(int arr[], int target) {
        // step 1 : Sort the array
        Arrays.sort(arr);
        // step 2 : traverse the array
        for (int i = 0; i < arr.length; i++) {
            // step : 3 setup two pointer
            int start = i+1;
            int end = arr.length-1;

            // Step 4: Use two pointers to find the triplet
            while (start < end){
                int sum = arr[i] + arr[start] + arr[end];
                // Triplet found
                if (sum == target) return true;
                else if (sum > target) end--;
                else start++;
            }
        }
        // If no triplet is found
        return false;
    }

    // Brute force Time : O(n3)
    public static boolean hasTripletSum1(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
