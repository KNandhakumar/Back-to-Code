package com.Nandhakumar.Oops.Exception_Handling.Finally.Questions;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Error found : " + e);
        }
        finally {
            System.out.println("this will always execute");
        }
    }
}
