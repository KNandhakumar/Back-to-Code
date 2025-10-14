package com.Nandhakumar.Java_Basics.Day_3.Methods.FunctionWithParameter;

public class petShop {
    // method with parameter
    void beagleDog(int price){
        System.out.print("Dog price : " + price + " ");
        System.out.println("Beagle purchased");
    }
    public static void main(String[] args) {
        // creating an object for Main class
        petShop dog = new petShop();
        dog.beagleDog(1000);
    }
}
