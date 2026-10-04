package com.Nandhakumar.Problem_Solving.Arrays.TwoPointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfArraysWithDistinct {
    // Intersection of Arrays with Distinct : https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3, 5, 6};
        int[] b = {3, 4, 5, 6, 7};
        ArrayList<Integer> result = findIntersection(a,b);
        System.out.println(result);
    }

    // Optimized approach Time : O(n+m) n - means a[] size, m - b[] size
    public static ArrayList<Integer> findIntersection(int[] a, int[] b) {
        // creating arraylist for put common elements into it
        ArrayList<Integer> result = new ArrayList<>();
        // hashset for get elements only
        HashSet<Integer> set = new HashSet<>();
        //put b[] elements into set
        for (int element : b){
            set.add(element);
        }
        // checking a[] is existing in b[] because we need to maintain the order that a[]
        for (int element : a){
            if (set.contains(element)){
                result.add(element);
            }
        }
        return result;
    }

    // Brute force approach Time : O(n2)
    public static ArrayList<Integer> findIntersection1(int[] a, int[] b) {
        // creating arraylist for put common elements into it
        ArrayList<Integer> result = new ArrayList<>();
        // creating hashmap for put everything into it
        HashMap<Integer,Integer> map = new HashMap<>();
        // put a[] elements into it
        for (int element : b){
            map.put(element,map.getOrDefault(element,0) +1);
        }

        // check b[] elements exists of a[]
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])){
                result.add(a[i]);
            }
        }
        return result;
    }
}
