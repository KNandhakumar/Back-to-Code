package com.Nandhakumar.Oops.Exception_Handling.Custom_Exception;

import java.util.Scanner;

class NotValidException extends Exception{
    NotValidException(String message){
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int age = in.nextInt();
            if (age<18){
                throw new NotValidException("Your age should be above 18");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
