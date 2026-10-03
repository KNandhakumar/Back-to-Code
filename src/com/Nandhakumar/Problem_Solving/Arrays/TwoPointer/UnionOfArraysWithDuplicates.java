package com.Nandhakumar.Problem_Solving.Arrays.TwoPointer;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArraysWithDuplicates {
    // Union of Arrays with Duplicates : https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};
        ArrayList<Integer> result = findUnion(a,b);
        System.out.println(result);
    }

    // Optimized approach O(n+m) n - means size of the a[], m - means size of the b[]
    public static ArrayList<Integer> findUnion1(int[] a, int[] b) {
        // creating arraylist for put unique elements into it
        ArrayList<Integer> result = new ArrayList<>();
        // hashset for find unique elements
        HashSet<Integer> set = new HashSet<>();
        // put a[] elements into hashset
        for (int elements : a) set.add(elements);
        // put b[] elements into hashset
        for (int elements : b) set.add(elements);
        // after the hashset, unique elements add into arraylist
        result.addAll(set);
        return result;
    }

    // Brute force approach Time : O(n2)
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // creating arraylist for put unique elements into it
        ArrayList<Integer> result = new ArrayList<>();
        // check a[] elements if it is unique then add into arraylist
        for (int elements : a) {
            if (!result.contains(elements)){
                result.add(elements);
            }
        }

        // check b[] elements if it is unique then add into arraylist
        for (int elements : a) {
            if (!result.contains(elements)){
                result.add(elements);
            }
        }
        return result;
    }
}
