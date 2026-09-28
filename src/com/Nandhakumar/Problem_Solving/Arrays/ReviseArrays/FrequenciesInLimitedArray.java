package com.Nandhakumar.Problem_Solving.Arrays.ReviseArrays;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequenciesInLimitedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        ArrayList<Integer> result = frequencyCount(arr);
        System.out.println(result);
    }
    public static ArrayList<Integer> frequencyCount(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int element : arr){
            map.put(element,map.getOrDefault(element,0) +1);
        }

        // creating arraylist for put on array
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(map.getOrDefault(i+1,0));
        }
        return result;
    }
}
