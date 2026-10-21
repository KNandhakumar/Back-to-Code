package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.TwoPointer;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(hasTripletSum(arr,13));
    }

    public static boolean hasTripletSum(int arr[], int target) {
        if (arr.length < 2) return false;
        // sort the array because of using two pointer
        Arrays.sort(arr);
        // traverse the array for fixing i index
        for (int i = 0; i < arr.length; i++) {
            // initialize two pointers
            int left = 0;
            int right = arr.length-1;
            // checking if triplet sum exist or not
            while (left<right){
                // triplet sum
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) return true;
                else if (sum > target) right--;
                else left++;
            }
        }
        return false;
    }

    public static boolean hasTripletSum1(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == target) return true;
                }
            }
        }
        return false;
    }
}
