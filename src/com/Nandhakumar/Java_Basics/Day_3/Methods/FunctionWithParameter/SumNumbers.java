package com.Nandhakumar.Java_Basics.Day_3.Methods.FunctionWithParameter;

public class SumNumbers {
    void sum(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void main(String[] args) {
        SumNumbers sum = new SumNumbers();
        sum.sum(10,20);
    }
}
