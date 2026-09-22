package com.Nandhakumar.Problem_Solving.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestElement {
    // Third largest element : https://www.geeksforgeeks.org/problems/third-largest-element/1
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5,5);
        System.out.println(thirdLargest(arr));
    }

    // Brute force approach O(n)
    public static int thirdLargest(List<Integer> arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        if (arr.size() < 3){
            return -1;
        }

        // Enhanced for loop or For each loop
        for (int num : arr){
            if (num>=first){
                third = second;
                second = first;
                first = num;
            }
            else if (num>=second){
                third = second;
                second = num;
            }
            else {
                third = num;
            }
        }

        // Traditional for loop
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i) >= first){
//                third = second;
//                second = first;
//                first = arr.get(i);
//            }
//            else if (arr.get(i) >= second){
//                third = second;
//                second = arr.get(i);
//            }
//            else {
//                third = arr.get(i);
//            }
//        }

        return third;
    }

    // Brute force approach Time : O(n log n)
    public static int thirdLargest1(List<Integer> arr) {
        // checking if n is less than 3 return - 1
        if (arr.size() < 3) return -1;

        // sorting the array
        Collections.sort(arr);

        // return the value
        return arr.get(arr.size() - 3);
    }
}
