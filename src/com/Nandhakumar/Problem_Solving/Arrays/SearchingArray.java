package com.Nandhakumar.Problem_Solving.Arrays;

public class SearchingArray {
    // Searching array : https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 3;
        System.out.println(search(arr,target));
    }

    // Brute force approach : Time : O(n)
    public static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
