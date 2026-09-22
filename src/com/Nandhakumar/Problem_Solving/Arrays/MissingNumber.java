package com.Nandhakumar.Problem_Solving.Arrays;

public class MissingNumber {
    // Missing number in array : https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(missingNum(arr));
    }

    // using another method Time : O(n)
    static int missingNum(int arr[]) {
        // assume ans is 1
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans){
                ans++;
            }
            else {
                break;
            }
        }
        return ans;
    }

    // Brute force approach : Time O(n)
    static int missingNum1(int arr[]) {
        // array is n-1 that's why n size 5
        int n = arr.length+1;
        // number series formula
        int formula = n*(n+1)/2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        // Expected sum − Actual sum = Missing number
        return formula - sum;
    }
}
