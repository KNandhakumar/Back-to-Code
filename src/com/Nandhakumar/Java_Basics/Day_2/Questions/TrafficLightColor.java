package com.Nandhakumar.Java_Basics.Day_2.Questions;

import java.util.Scanner;

public class TrafficLightColor {
    public static void main(String[] args) {
        // Question : What is the color of traffic light?
        // if the answer is red, print "stop"
        // if the color is yellow, print ""
        // if the color is green, print "go"
        Scanner in = new Scanner(System.in);
        String signal = in.next();
        if (signal.equals("red")){
            System.out.println("Stop");
        }
        else if(signal.equals("yellow")){
            System.out.println("Get Ready");
        }
        else if (signal.equals("green")){
            System.out.println("Go");
        }
        else {
            System.out.println("Something wrong");
        }
    }
}