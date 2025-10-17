package com.Nandhakumar.Oops.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // handling exceptions
        try {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("a/b = " + a/b);
        }
        // arithmetic exception for division by zero
        catch (ArithmeticException e){
            System.out.println("exception handled : " + e);
        }
        // input mismatch exception
        catch (InputMismatchException e){
            System.out.println("input mismatch please enter integer : " + e);
        }
    }
}
