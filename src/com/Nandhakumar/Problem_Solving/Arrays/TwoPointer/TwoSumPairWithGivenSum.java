package com.Nandhakumar.Problem_Solving.Arrays.TwoPointer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumPairWithGivenSum {
    // Two Sum - Pair with Given Sum : https://www.geeksforgeeks.org/problems/key-pair5616/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        System.out.println(twoSum(arr,target));
    }

    // Optimize approach Time : O(n log n)
    static boolean twoSum(int arr[], int target) {
        // if two pointer using, we first sort the array
        Arrays.sort(arr);
        int left = 0;
        // index access
        int right = arr.length-1;

        while (left<right){
            int sum = arr[left] + arr[right];
            if (sum == target) return true;
            else if (sum > target) right--;
            else left++;
        }
        return false;
    }

    // Brute force approach Time : O(n2) Space : O(1)
    static boolean twoSum1(int arr[], int target) {
        if (arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
