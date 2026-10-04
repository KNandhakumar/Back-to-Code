package com.Nandhakumar.Problem_Solving.Arrays.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    // Remove Duplicates Sorted Array : https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        ArrayList<Integer> result = removeDuplicates(arr);
        System.out.println(result);
    }

    // when array was sorted and we need to remove duplicates -> compare with previous elements
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        // creating arraylist for put distinct elements into it
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i-1]) continue;
            // put distinct elements into arraylist
            result.add(arr[i]);
        }
        return result;
    }

    // when array was sorted and we need to remove duplicates -> compare with previous elements
    static ArrayList<Integer> removeDuplicates1(int[] arr) {
        // creating arraylist for put distinct elements into it
        ArrayList<Integer> result = new ArrayList<>();
        // put first element into arraylist
        result.add(arr[0]);
        // check duplicates
        for (int i = 1; i < arr.length; i++) {
            // check previous values if its exists so skip it
            if (arr[i] != arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }


    // Brute force approach Time : O(n2) because loop runs n, contains() search n so (n2)
    static ArrayList<Integer> removeDuplicates2(int[] arr) {
        // creating arraylist for put distinct elements into it
        ArrayList<Integer> result = new ArrayList<>();
        // check elements if it is distinct then put into arraylist
        for (int element : arr) {
            if (!result.contains(element)) result.add(element);
        }
        return result;
    }
}
