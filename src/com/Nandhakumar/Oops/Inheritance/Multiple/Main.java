package com.Nandhakumar.Oops.Inheritance.Multiple;

interface Animal{
    void makeSound();
}

interface Dog{
    void makeSound();
}

class Pigeon implements Animal,Dog{
    public void makeSound(){
        System.out.println("Pigeon");
    }
}

public class Main {
    public static void main(String[] args) {
        Pigeon pura = new Pigeon();
        pura.makeSound();
    }
}
