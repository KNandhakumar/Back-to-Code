package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {0, 0, 2, 1, 1};
        System.out.println(fourSum(arr,3));
    }

    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // store all the possibilities
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // sort the array because of should be return sorted order
        Arrays.sort(arr);
        //traverse the array fix two points i and j
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                // initialize two pointers
                int left = j+1;
                int right = arr.length-1;

                while (left<right){
                    // taking sum 0f quadruples
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    // checking if quadruples exist or not
                    if (sum == target){
                        // creating list for store current quadruple
                        ArrayList<Integer> current = new ArrayList<>();
                        current.add(arr[i]);
                        current.add(arr[j]);
                        current.add(arr[left]);
                        current.add(arr[right]);

                        // current quadruple add it into result
                        result.add(current);
                        // while loop no stuck
                        left++;
                        right--;
                    }
                    else if (sum > target) right--;
                    else left++;
                }
            }
        }
        return result;
    }

    // Brute force approach Time : O(n4 log n)
    public static ArrayList<ArrayList<Integer>> fourSum1(int[] arr, int target) {
        // store all the possibilities
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // sort the array because of should be return sorted order
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    for (int l = k+1; l < arr.length; l++) {
                        // taking sum of four pointers
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if (sum == target){
                            // store the current quadruples
                            ArrayList<Integer> current = new ArrayList<>();
                            current.add(arr[i]);
                            current.add(arr[j]);
                            current.add(arr[k]);
                            current.add(arr[l]);
                            // put into result
                            result.add(current);
                        }
                    }
                }
            }
        }
        return result;
    }
}
