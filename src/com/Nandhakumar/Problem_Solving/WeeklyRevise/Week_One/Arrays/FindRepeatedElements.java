package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class FindRepeatedElements {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4};
        System.out.println(findDuplicate(arr));
    }

    // Time : O(n)
    public static int findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int element : arr){
            // whether element already exist or not
            if (set.contains(element)) return element;
            // add into hashset
            set.add(element);
        }
        return -1;
    }

    // Time : O(n) Space : O(n)
    public static int findDuplicate1(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int element : arr){
            // first checking if current element is existing or not
            if (map.containsKey(element)) {
                return element;
            }
            // add it hashmap
            map.put(element,map.getOrDefault(element,0) +1);
        }
        return -1;
    }

    // Time : O(n2) Space : O(n)
    public static int findDuplicate2(int[] arr) {
        // creating map for getting frequencies
        HashMap<Integer,Integer> map = new HashMap<>();
        // put every elements into it
        for (int element : arr){
            map.put(element,map.getOrDefault(element,0) +1);
        }
        // checking duplicate if more than appears once
        for (int element : arr){
            if (map.get(element) > 1) return element;
        }
        return -1;
    }

    // Better approach Time : O(n) Space : O(n)
    public static int findDuplicate3(int[] arr) {
        // taking frequencies of array
        int[] freq = new int[arr.length];
        // take every element and put it into freq
        for (int element : arr){
            freq[element]++;
            // checking the freq
            if (freq[element] == 2) return element;
        }
        return -1;
    }

    // Brute force approach O(n)
    public static int findDuplicate4(int[] arr) {
        // size is n-1 because one number occurs twice
        int n = arr.length-1;
        // formula for duplicate number using number series
        int formula = n * (n+1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        // actual sum - expected sum = duplicate number
        return sum - formula;
    }
}
