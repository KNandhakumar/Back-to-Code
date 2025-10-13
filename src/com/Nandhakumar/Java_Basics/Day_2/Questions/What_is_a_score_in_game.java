package com.Nandhakumar.Java_Basics.Day_2.Questions;

import java.util.Scanner;

public class What_is_a_score_in_game {
    public static void main(String[] args) {
        // Question : what is the score in a game?
        // if the score is less than 50, print "You need to improve"
        // if the score is between 50 and 70, print "Good score"
        // if the score is greater than 70, print "Excellent performance"
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        if (score<50){
            System.out.println("You need to improve");
        }
        else if (score>=50 && score<=70){
            System.out.println("Good score");
        }
        else{
            System.out.println("Excellent performance");
        }
    }
}