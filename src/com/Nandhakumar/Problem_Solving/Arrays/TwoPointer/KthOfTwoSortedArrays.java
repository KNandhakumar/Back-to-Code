package com.Nandhakumar.Problem_Solving.Arrays.TwoPointer;

import java.util.Arrays;
import java.util.HashSet;

public class KthOfTwoSortedArrays {
    // K-th of Two Sorted Arrays : https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        System.out.println(kthElement(a,b,k));
    }

    // Optimized approach
    public static int kthElement(int a[], int b[], int k) {
        // both arrays are sorted so we can use two pointer approach
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < a.length && j < b.length){
            // compare both pointer i and j, taking small one
            if (a[i] <= b[j]){
                count++;
                // answer found
                if (count == k) return a[i];
                // move i point next
                i++;
            }
            else {
                count++;
                // answer found
                if (count == k) return b[j];
                // move j point next
                j++;
            }
        }
        // if i break then check separately
        while (i < a.length){
            count++;
            // answer found
            if (count == k) return a[i];
            // move i point next
            i++;
        }
        // if j break then check separately
        while (j < b.length){
            count++;
            // answer found
            if (count == k) return b[j];
            // move j point next
            j++;
        }
        // no answer found
        return -1;
    }

    // Brute force approach Time : O(n2)
    public static int kthElement1(int a[], int b[], int k) {
        // create array for combine a[] b[]
        int n = a.length;
        int m = b.length;
        int[] merge = new int[n+m];
        // put a[] elements into merge
        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
        }
        // put b[] elements into merge
        for (int i = 0; i < b.length; i++) {
            merge[n+i] = b[i];
        }
        // sort the array
        Arrays.sort(merge);
        return merge[k-1];
    }
}
