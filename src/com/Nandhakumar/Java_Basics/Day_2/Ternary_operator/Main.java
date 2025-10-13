package com.Nandhakumar.Java_Basics.Day_2.Ternary_operator;

public class Main {
    public static void main(String[] args) {
        // In java ternary operator is a shorthand for the if-else statement and used to
        // assign a value to a variable based on a condition.
        // normal if condition
        if (true){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        // Syntax for ternary operator
        // variable = (condition) ? valueIfTrue : valueIfFalse
        // ternary operator
        System.out.println(10>5?"True":"False");
    }
}
