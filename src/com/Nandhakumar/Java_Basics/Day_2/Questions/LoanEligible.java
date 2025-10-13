package com.Nandhakumar.Java_Basics.Day_2.Questions;

import java.util.Scanner;

public class LoanEligible {
    public static void main(String[] args) {
        // Question : Get input for salary and age. if salary >= 20k or age <= 25,
        // get input for required loan amount. if not print you are not eligible for loan.
        // if required loan amount is <= to 50k print you are eligible for loan.
        // if it is > 50k print maximum loan amount is 50k.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        int salary = in.nextInt();
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        if (salary>=20000 || age<=25){
            System.out.println("Eligible for loan");
            System.out.print("Enter how much loan you want : ");
            int loan = in.nextInt();
            if (loan<=50000){
                System.out.println("you are eligible for loan");
            }
            else if (loan>50000){
                System.out.println("Maximum loan amount is 50k");
            }
        }
        else {
            System.out.println("not eligible for loan");
        }
    }
}