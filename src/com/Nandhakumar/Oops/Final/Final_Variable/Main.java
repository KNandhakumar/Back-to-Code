package com.Nandhakumar.Oops.Final.Final_Variable;

public class Main {
    public static void main(String[] args) {
        // using without final keyword
        // without final keyword, we can change (modify) value
        double PI = 3.14;
        PI = 10;
        System.out.println(PI);
        // using with final keyword
        final int num = 10;
//        num = 5; // cannot be change the value because final is constant
        System.out.println(num);
    }
}
