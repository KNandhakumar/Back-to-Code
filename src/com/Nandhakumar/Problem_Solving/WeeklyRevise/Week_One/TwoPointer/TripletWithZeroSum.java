package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.TwoPointer;

import java.util.Arrays;

public class TripletWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr));
    }

    // Optimized approach Two pointer Time O(n2)
    public static boolean findTriplets(int[] arr) {
        Arrays.sort(arr);
        if (arr.length < 2) return false;
        for (int i = 0; i < arr.length; i++) {
            // initialize two pointer
            int left = i+1;
            int right = arr.length-1;
            while (left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) return true;
                else if (sum < 0) left++;
                else right--;
            }
        }
        return false;
    }
    // Brute force approach Time O(n3)
    public static boolean findTriplets1(int[] arr) {
        if (arr.length < 2) return false;
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
