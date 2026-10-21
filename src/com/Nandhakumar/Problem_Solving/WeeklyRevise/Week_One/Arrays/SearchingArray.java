package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.Arrays;

public class SearchingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 3;
        System.out.println(search(arr,target));
    }

    public static int search(int arr[], int x) {
        if (arr.length == 0) return -1;
        // traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

}
