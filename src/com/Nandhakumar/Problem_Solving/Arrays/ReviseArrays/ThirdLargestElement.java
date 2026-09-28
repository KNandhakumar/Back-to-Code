package com.Nandhakumar.Problem_Solving.Arrays.ReviseArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestElement {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 4, 1, 3, 5);
        System.out.println(thirdLargest(arr));
    }

    public static int thirdLargest(List<Integer> arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int element : arr) {
            if (element >= first){
                third = second;
                second = first;
                first = element;
            }
            else if (element >= second){
                third = second;
                second = element;
            }
            else {
                third = element;
            }
        }
        return third;
    }
}
