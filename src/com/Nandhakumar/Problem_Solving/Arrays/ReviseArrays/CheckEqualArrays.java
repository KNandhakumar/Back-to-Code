package com.Nandhakumar.Problem_Solving.Arrays.ReviseArrays;

import java.util.Arrays;
import java.util.HashMap;

public class CheckEqualArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};
        System.out.println(checkEqual(a,b));
    }

    // Time O(n)
    public static boolean checkEqual(int[] a, int[] b) {
        // checking if arr size different so false
        if (a.length != b.length) return false;

        // sorting arrays then check both are same or not
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    // Time : O(n2)
    public static boolean checkEqual1(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (a.length != b.length) return false;

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < b.length; i++) {
            if (!map.containsKey(b[i])) {
                return false;
            }
        }
        return true;
    }
}
