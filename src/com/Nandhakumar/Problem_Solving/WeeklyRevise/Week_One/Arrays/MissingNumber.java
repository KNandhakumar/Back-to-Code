package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(missingNum(arr));
    }
    static int missingNum(int arr[]) {
        // arr size is n-1 because one number missing, that's why we take n+1
        int n = arr.length+1;
        // formula for missing number using number series
        int formula = n*(n+1)/2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        // expected sum - actual sum = missing number
        return formula - sum;
    }
}
