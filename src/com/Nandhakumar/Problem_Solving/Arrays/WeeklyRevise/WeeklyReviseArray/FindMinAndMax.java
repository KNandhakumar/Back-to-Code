package com.Nandhakumar.Problem_Solving.Arrays.WeeklyRevise.WeeklyReviseArray;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 8, 6};
        System.out.println(getMinMax(arr));
    }

    public static ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        // assume minValue greater, max value negative
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        // traver the array
        for (int i = 0; i < arr.length; i++){
            // checking min value
            if(minValue > arr[i]) minValue = arr[i];
            if(maxValue < arr[i]) maxValue = arr[i];
        }
        // put min and max value into result array
        result.add(minValue);
        result.add(maxValue);
        return result;
    }
}
