package com.Nandhakumar.Problem_Solving.Arrays;

import java.util.Arrays;

public class CheckEqualArrays {
    // Check Equal Arrays : https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};
        System.out.println(checkEqual(a,b));
    }

    public static boolean checkEqual(int[] a, int[] b) {
        if (a.length != b.length){
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        // checking
        for (int i = 0; i < a.length; i++) {
            if (a[i] !=  b[i]){
                return false;
            }
        }
        return true;
    }
}
