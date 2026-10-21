package com.Nandhakumar.Problem_Solving.Arrays.WeeklyRevise.WeeklyReviseArray;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequenciesInLimitedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        System.out.println(frequencyCount(arr));
    }

    public static ArrayList<Integer> frequencyCount(int[] arr) {
        // put every arr elements into map
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int element : arr){
            map.put(element,map.getOrDefault(element,0) +1);
        }
        // create arraylist for store the frequencies
        ArrayList<Integer> result = new ArrayList<>();
        // put frequencies into result
        for (int i = 1; i <= arr.length; i++) {
            result.add(map.getOrDefault(i,0));
        }
        return result;
    }
}
