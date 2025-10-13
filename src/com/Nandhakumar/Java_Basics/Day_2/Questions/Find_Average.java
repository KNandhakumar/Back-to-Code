package com.Nandhakumar.Java_Basics.Day_2.Questions;

import java.util.Scanner;

public class Find_Average {
    public static void main(String[] args) {
        // Question : Get input for five subjects marks. add all of it, and find average.
        // if average mark is less than 35. print ""Additional class is required,
        // else print "you are good to go"
        Scanner in = new Scanner(System.in);
        int tamil = in.nextByte();
        int english = in.nextByte();
        int maths = in.nextByte();
        int physics = in.nextByte();
        int chemistry = in.nextByte();
        int totalMark = tamil+english+maths+physics+chemistry;
        int average = totalMark/5;
        if (average<35){
            System.out.println("Additional class is required");
        }
        else {
            System.out.println("you are good to go");
        }
    }
}