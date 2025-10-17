package com.Nandhakumar.Oops.Exception_Handling.Questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("a/b = " + a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Error handled : " + e);
        }
        catch (InputMismatchException e){
            System.out.println("error handled : " + e);

        }
    }
}
