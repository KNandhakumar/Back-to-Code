package com.Nandhakumar.Problem_Solving.Arrays.ReviseArrays;

import java.util.HashMap;

public class ArraySubset {
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a,b));
    }

    public static boolean isSubset(int a[], int b[]) {
        // creating hashmap for frequency checking
        HashMap<Integer,Integer> map = new HashMap<>();
        // put a[] elements into hashmap
        for (int element : a){
            map.put(element,map.getOrDefault(element,0) +1);
        }

        // checking b[] elements have in a[]
        for (int element : b){
            if (!map.containsKey(element) || map.get(element) == 0) {
                return false;
            }

            // use one copy of element so decrease it
            map.put(element,map.get(element) -1);
            System.out.println(map.put(element,map.get(element) -1));
        }
        return true;
    }
}
