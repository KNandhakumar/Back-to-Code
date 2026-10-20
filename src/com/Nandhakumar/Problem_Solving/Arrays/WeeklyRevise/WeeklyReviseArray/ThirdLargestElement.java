package com.Nandhakumar.Problem_Solving.Arrays.WeeklyRevise.WeeklyReviseArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestElement {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(22, 14, 1, 53, 5);
        System.out.println(thirdLargest(arr));
    }

    public static int thirdLargest(List<Integer> arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        // if arr size less than 3 return -1
        if (arr.size() < 3) return -1;
        // traverse the array
        for (int i = 0; i < arr.size(); i++) {
            if (first <= arr.get(i)){
                third = second;
                second = first;
                first = arr.get(i);
            }
            else if (second <= arr.get(i)){
                third = second;
                second = arr.get(i);
            }
            else {
                third = arr.get(i);
            }
        }
        return third;
    }

    // Brute force approach O(log n)
    public static int thirdLargest1(List<Integer> arr) {
        // checking if arr size is less than 3 return - 1
        if (arr.size() < 3) return -1;
        // sort the array
        Collections.sort(arr);
        // return the value
        return arr.get(arr.size()-3);
    }
}
