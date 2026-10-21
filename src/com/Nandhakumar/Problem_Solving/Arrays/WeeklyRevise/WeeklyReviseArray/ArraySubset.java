package com.Nandhakumar.Problem_Solving.Arrays.WeeklyRevise.WeeklyReviseArray;

import java.util.HashMap;

public class ArraySubset {
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a,b));
    }

    public static boolean isSubset(int a[], int b[]) {
        // put a[] elements into map
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int element : a){
            map.put(element,map.getOrDefault(element,0) + 1);
        }
        // checking b[] contains a[]
        for (int element : b){
            // if it is not existing return false
            if (!map.containsKey(element) || map.get(element) == 0) return false;
            // use one copy of element so decrease it
            map.put(element,map.getOrDefault(element,0) -1);
        }
        return true;
    }
}
