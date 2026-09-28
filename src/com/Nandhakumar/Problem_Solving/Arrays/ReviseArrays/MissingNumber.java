package com.Nandhakumar.Problem_Solving.Arrays.ReviseArrays;

import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(missingNum(arr));
    }
    static int missingNum(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // put arr elements into hashmap
        for (int element : arr){
            map.put(element, map.getOrDefault(element,0) + 1);
        }
        // checking missing element
        for (int i = 1; i <=arr.length ; i++) {
            if (!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }


    static int missingNum1(int arr[]) {
        int ans = 1;
        for (int num : arr){
            if (num == ans){
                ans++;
            }
            else {
                break;
            }
        }
        return ans;
    }

    static int missingNum2(int arr[]) {
        int n = arr.length+1;
        long formula = (long) n*(n+1)/2;
        int sum = 0;
        for (int num : arr) {
            sum+=num;
        }

        return (int) formula - sum;
    }
}
