package com.Nandhakumar.Problem_Solving.Arrays;

import java.util.HashMap;

public class ArraySubset {
    // Array subset : https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a,b));
    }

    // Very hard to learn it took 2 days for me : Time O(n + b) n is size of array b is size of checking
    public static boolean isSubset(int a[], int b[]) {
        // creating hashmap for frequency and counting
        // for using hashmap we can easily find duplicates and counting
        HashMap<Integer,Integer> map = new HashMap<>();

        // add every a[] elements into map
        for (int element : a){
            map.put(element,map.getOrDefault(element,0) + 1);
        }

        // checking if all b[] elements having in a[] or not
        for (int element : b){
            if (!map.containsKey(element) || map.get(element) == 0){
                return false;
            }

            // use one copy of element so decrease it
            map.put(element,map.get(element) - 1);
        }
        return true;
    }
}
