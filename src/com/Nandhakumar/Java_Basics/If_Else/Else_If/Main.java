package com.Nandhakumar.Java_Basics.If_Else.Else_If;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Else if -> In java, "else if" is used after an "if" statement and
        // before an "else" statement to test multiple conditions sequentially
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        // if block run, when if is true
        if (score>=35 && score<60){
            System.out.println("Your gift is video game");
        }
        // when if block false then run, else if
        else if (score>=60 && score<90){
            System.out.println("Your gift is Iphone");
        }
        else if (score>=90){
            System.out.println("Your gift is Bike");
        }
        // if and else if false then run, else
        else {
            System.out.println("Try to get good score");
        }
    }
}
