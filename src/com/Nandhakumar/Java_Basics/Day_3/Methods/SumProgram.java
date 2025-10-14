package com.Nandhakumar.Java_Basics.Day_3.Methods;

public class SumProgram {
    int a = 10;
    int b = 20;

    void sum(){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        // creating an object for sumProgram
        SumProgram obj = new SumProgram();
        obj.sum();
    }
}
