package com.Nandhakumar.Java_Basics.Day_3.Methods;

public class Mami {
    String name = "Mami";
    // creating methods (function)
    void actress(){
        System.out.println(name + " is a talented actress");
    }
    void singer(){
        System.out.println(name + " is a nice singer");
    }
    public static void main(String[] args) {
        // creating an object for Mami class for access the Mami class fields and methods
        // we dont need to create an object for static methods
        // non static method we need to create an object
        Mami mami = new Mami();
        // calling Mami class method
        mami.actress();
        mami.singer();
    }
}
