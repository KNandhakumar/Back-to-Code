package com.Nandhakumar.Oops.Exception_Handling.Custom_Exception;

import java.util.Scanner;

class AgeNotValid extends Exception{
    AgeNotValid(String message){
        super(message);
    }
}

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int VoterAge = in.nextInt();
            if (VoterAge<18){
                throw new AgeNotValid("Vote only for 18 years above people");
            }
        }
        catch (AgeNotValid e){
            System.out.println(e);
        }
    }
}
