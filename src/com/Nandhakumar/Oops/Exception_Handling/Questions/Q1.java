package com.Nandhakumar.Oops.Exception_Handling.Questions;

class DivisionExample {
    static void divideNumbers(int num1, int num2){
        try {
            int result = num1/num2;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        DivisionExample.divideNumbers(10,0);
    }
}
