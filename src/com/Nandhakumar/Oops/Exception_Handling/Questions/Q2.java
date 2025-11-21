package com.Nandhakumar.Oops.Exception_Handling.Questions;

class InValidAgeException extends Exception {
    InValidAgeException(String message){
        super(message);
    }
}

class AgeValidator {
    static void checkAge(int age){
        try {
            if (age<0 || age>150){
                throw new InValidAgeException("Age should be greater");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        AgeValidator.checkAge(-1);
    }
}
