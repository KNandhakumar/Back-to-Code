package com.Nandhakumar.Problem_Solving.Arrays.ReviseArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 8, 6};
        ArrayList<Integer> result = getMinMax(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr){
            if (num < min) min = num;
            if (num > max) max = num;
        }
        result.add(min);
        result.add(max);
        return result;
    }
}
