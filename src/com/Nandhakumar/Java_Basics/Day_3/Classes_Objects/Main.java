package com.Nandhakumar.Java_Basics.Day_3.Classes_Objects;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    // creating my favorite actress
    String name = "";
    int age = 0;
    String profession = "";
    String state = "";
    public static void main(String[] args) {
        // creating an object for Main class
        // we should create an object for a Main class to access the all fields and methods
        Main mami = new Main();
        mami.name = "Mamitha";
        mami.age = 24;
        mami.profession = "Dancer";
        mami.state = "Kerala";
        System.out.println(mami.name);
    }
}
