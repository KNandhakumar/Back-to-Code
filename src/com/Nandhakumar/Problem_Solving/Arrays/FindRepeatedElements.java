package com.Nandhakumar.Problem_Solving.Arrays;

public class FindRepeatedElements {
    // Find repeated elements : Find Only Repetitive Element from 1 to n-1
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        // it'll handle integer overflow
        int n = arr.length;
        long formula = (long) n*(n-1)/2;

        long sum = 0;

        for (int num : arr){
            sum+=num;
        }
        return (int) (sum - formula);
    }

    // Better approach Time O(n)
    public static int findDuplicate1(int[] arr) {
        // frequency method
        int[] freq = new int[arr.length];
        for (int num : arr) {
            // count the element frequency
            freq[num]++;

            // check repeated
            if (freq[num] == 2) {
                return num;
            }
        }
        return -1;
    }
}
