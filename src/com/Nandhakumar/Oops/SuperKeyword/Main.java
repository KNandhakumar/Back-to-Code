package com.Nandhakumar.Oops.SuperKeyword;

class Nandhakumar{
    int age;
    String name = "Mami";
    Nandhakumar(){
        System.out.println(name + " is good partner and good friend to me");
    }
    // creating method for super keyword to access methods
    void love(){
        System.out.println("i love " + name);
    }
}

class Mami extends Nandhakumar{
    Mami(String name){
        // Default super keyword
        super(); // call parent class constructor
        super.age = 24; // accessing parent class variables
        System.out.println("me and nk both are age is same : " + age);
    }
}
// accessing parent class variables
// call parent class constructor immediately
// call parent class methods
// when you think child class not run first then add super(),
// so parent class run first while child class running
public class Main {
    public static void main(String[] args) {
        Mami mamitha = new Mami("Nandhakumar");
    }
}
