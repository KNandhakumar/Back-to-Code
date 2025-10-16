package com.Nandhakumar.Oops.StaticKeyword;

class Person {
    static String FavoritePerson = "Mamitha";
}

// static is class level not an object level
// we dont need to create an object to access static variables and methods
public class StaticVariable {
    public static void main(String[] args) {
        System.out.println(Person.FavoritePerson);
    }
}
