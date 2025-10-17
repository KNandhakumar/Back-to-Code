package com.Nandhakumar.Oops.Exception_Handling.Finally.Questions;

public class FinallyBasic {
    public static void main(String[] args) {
        try {
            System.out.println("try block executed");
        } catch (Exception e){
            System.out.println("no exception");
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
