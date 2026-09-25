package com.Nandhakumar.Problem_Solving.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FrequenciesInLimitedArray {
    // Frequencies in a Limited Array : https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        ArrayList<Integer> result = frequencyCount(arr);
        System.out.println(result);
    }

    // Time : O(n)
    public static ArrayList<Integer> frequencyCount(int[] arr) {
        // Step 1: Create a HashMap to count the frequencies
        HashMap<Integer,Integer> map = new HashMap<>();

        // Step 2 : add every arr[] elements into map
        for (int element : arr){
            map.put(element, map.getOrDefault(element,0) +1);
        }

        // step 3 : create arraylist as a result
        ArrayList<Integer> result = new ArrayList<>();

        // Step 4 : put frequencies into result
        for (int i = 0; i < arr.length; i++){
            result.add(map.getOrDefault(i+1 ,0));
        }
        return result;
    }
}
