package com.Nandhakumar.Java_Basics.Day_2.Compare_Strings;

public class Main {
    public static void main(String[] args) {
        String f1 = new String("apple");
        String f2 = new String("apple");

        String a1 = "orange";
        String a2 = "orange";

        // in this comparison not checking two variable values, instead they're checking their address
        // (reference) orange==orange its not. instead a1 pointing orange a2 also pointing orange.
        // java not creating again and again same value. instead java change the address like this.
        System.out.println(a1==a2);
        // f1 pointing new memory location, f2 pointing another memory location it is not point
        // the single address (reference)
        System.out.println(f1==f2);
        // we need to check the strings values are equal or not, we should use the equals method(function)
        System.out.println(f1.equals(f2));
    }
}
