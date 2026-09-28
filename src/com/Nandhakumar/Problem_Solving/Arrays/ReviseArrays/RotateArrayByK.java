package com.Nandhakumar.Problem_Solving.Arrays.ReviseArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(rotateArray(arr,2));
    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        k = k%arr.size();

        // save first k elements
        int[] last = new int[k];
        for (int i = 0; i < k; i++) {
            last[i] = arr.get(i);
        }

        // Shift remaining elements left
        for (int i = k; i < arr.size(); i++) {
            arr.set(i - k, arr.get(i));
        }

        // Put saved elements at the end
        for (int i = 0; i < k; i++) {
            arr.set(arr.size() - k + i, last[i]);
        }

        return arr;
    }
}
