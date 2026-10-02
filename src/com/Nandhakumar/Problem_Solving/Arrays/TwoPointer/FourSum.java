package com.Nandhakumar.Problem_Solving.Arrays.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    // 4 sum : https://www.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1
    public static void main(String[] args) {
        int[] arr = {0, 5, 2, 4, 3, 1};
        int target = 10;
        ArrayList<ArrayList<Integer>> result = fourSum(arr,target);
        System.out.println(result);
    }

    // Better approach but its allows duplicates Time : O(n3)
    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // creating Arraylist for put all possibilities
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // sort the array
        Arrays.sort(arr);

        // traverse the array because i, j pointing
        // fix i pointer
        for (int i = 0; i < arr.length; i++) {
            // fix j pointer
            for (int j = i+1; j < arr.length; j++) {
                // initialize two pointer
                int start = j+1;
                int end = arr.length-1;

                while (start < end){
                    // sum the pointer index
                    int sum = arr[i] + arr[j] + arr[start] + arr[end];
                    // checking the sum equal to target then we store the elements in list type
                    if (sum == target){
                        // creating arraylist for storing the current possibility
                        ArrayList<Integer> current = new ArrayList<>();
                        current.add(arr[i]);
                        current.add(arr[j]);
                        current.add(arr[start]);
                        current.add(arr[end]);

                        // then store it result list
                        result.add(current);
                        // while loop no stuck
                        start++;
                        end--;
                    }
                    else if (sum > target){
                        end--;
                    }
                    else start++;
                }
            }
        }
        return result;
    }

    // Brute force approach Time : O(n4)
    public static ArrayList<ArrayList<Integer>> fourSum1(int[] nums, int target) {
        // creating list because store all possibilities
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // traverse the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    for (int l = k+1; l < nums.length; l++) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum == target){
                            // creating arraylist for storing the current possibility
                            ArrayList<Integer> current = new ArrayList<>();
                            current.add(nums[i]);
                            current.add(nums[j]);
                            current.add(nums[k]);
                            current.add(nums[l]);

                            // put into result list
                            result.add(current);
                        }
                    }
                }
            }
        }
        return result;
    }
}
