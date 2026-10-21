package com.Nandhakumar.Problem_Solving.WeeklyRevise.Week_One.Arrays;

import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Better approach O(n)
    public static void sort012(int[] arr) {
        int zero = 0;
        int ones = 0;
        int twos = 0;

        // count the 0,s, 1's, 2's
        for (int element : arr){
            if (element == 0) zero++;
            else if (element == 1) ones++;
            else twos++;
        }

        // put every 0's, 1's, 2's counts into ascending  order
        int index = 0;
        // for 0's
        while (zero > 0){
            arr[index] = 0;
            index++;
            zero--;
        }
        // for 1's
        while (ones > 0){
            arr[index] = 1;
            index++;
            ones--;
        }
        // for 2's
        while (twos > 0){
            arr[index] = 2;
            index++;
            twos--;
        }
    }

    // Brute force O(n2)
    public static void sort0121(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Brute force approach O(log n)
    public static void sort0122(int[] arr) {
        Arrays.sort(arr);
    }
}
