package com.Nandhakumar.Problem_Solving.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinAndMax {
    // Min and Max in Array : https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
    public static void main(String[] args) {
        int[] arr = {1, 4, 3 , 5, 8, 6};
        ArrayList<Integer> result = getMinMax(arr);
        System.out.println(result.getFirst() + " " + result.getLast());
    }

    // Brute force approach O(n2)
    public static ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        Collections.sort(result);
        return result;
    }

    // Better approach Time : O(n)
    public static ArrayList<Integer> getMinMax1(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        // assume min is big integer like 12345
        int minValue = Integer.MAX_VALUE;
        // assume max is a negative integer like -12345
        int maxValue = Integer.MIN_VALUE;

        for (int num : arr) {
            // minvalue is like 12345 greater than 1 so its true, we need to add this
            if (minValue > num) minValue = num;
            if (maxValue < num) maxValue = num;
        }
        result.add(minValue);
        result.add(maxValue);
        return result;
    }
}
