package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.TwoPointer;

import java.util.Arrays;

public class TwoSumPairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println(twoSum(arr,-2));
    }

    // Optimized approach Time : O(n log n)
    static boolean twoSum(int[] arr, int target) {
        if (arr.length < 1) return false;
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == target) return true;
            else if (sum > target) right--;
            else left++;
        }
        return false;
    }

    // Brute force approach Time : O(n2)
    static boolean twoSum1(int[] arr, int target) {
        if (arr.length < 1) return false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) return true;
            }
        }
        return false;
    }
}
