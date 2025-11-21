package com.Nandhakumar.Oops.Exception_Handling.Throw;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int age = in.nextInt();
            if (age<1){
                throw new ArithmeticException("age should be greater than 1");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Program ended");
    }
}
