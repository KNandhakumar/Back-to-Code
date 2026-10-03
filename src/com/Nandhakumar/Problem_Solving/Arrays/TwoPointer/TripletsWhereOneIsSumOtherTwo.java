package com.Nandhakumar.Problem_Solving.Arrays.TwoPointer;

import java.util.Arrays;

public class TripletsWhereOneIsSumOtherTwo {
    // Triplets Where One is Sum of Other Two : https://www.geeksforgeeks.org/problems/count-the-triplets4615/1
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(countTriplet(arr));
    }

    // Optimized solution O(n2)
    public static int countTriplet(int arr[]) {
        int count = 0;
        // sort the array
        Arrays.sort(arr);
        // traverse the array
        for (int i = 0; i < arr.length; i++) {
            // skip duplicates
            if (i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            // two pointer
            int j = i+1;
            int k = j+1;

            while (k < arr.length){
                int sum = arr[i] + arr[j];
                if (sum == arr[k]){
                    count++;
                    // loop not stuck
                    // move j
                    int current = arr[j];
                    j++;
                    while (j < k && arr[j] == current){
                        j++;
                    }
                    k++;
                }
                else if (sum < arr[k]) {
                    int current = arr[j];
                    j++;
                    while (j < k && arr[j] == current){
                        j++;
                    }
                }
                else k++;
                if (j == k) k++;
            }
        }
        return count;
    }

    // Better approach, duplicates now allowed Time : O(n3)
    public static int countTriplet1(int arr[]) {
        // sort the array because larger elements will go last, now elements like i<=j<=k
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i-1]) continue;
            for (int j = i+1; j < arr.length; j++) {
                if (j > i+1 && arr[j] == arr[j-1]) continue;
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] == arr[k]) count++;
                }
            }
        }
        return count;
    }


    // Brute force approach duplicates allowing Time : O(n3)
    public static int countTriplet2(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] == arr[k]) count++;
                    else if (arr[i] + arr[k] == arr[j]) count++;
                    else if (arr[j] + arr[k] == arr[i]) count++;
                }
            }
        }
        return count;
    }
}
