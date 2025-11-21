package com.Nandhakumar.Oops.Exception_Handling.Throw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int a = in.nextInt();
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(num1/num2);
            throw new InputMismatchException("Please enter valid number");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Program ended");
        }
    }
}
