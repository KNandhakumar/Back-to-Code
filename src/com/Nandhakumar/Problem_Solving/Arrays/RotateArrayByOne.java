package com.Nandhakumar.Problem_Solving.Arrays;

import java.util.Arrays;

public class RotateArrayByOne {
    // Rotate Array by One : https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Better approach Time : O(n)
    public static void rotate(int[] arr) {
        // take last element
        int last = arr[arr.length-1];

        // rotating every element into right shift
        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}
