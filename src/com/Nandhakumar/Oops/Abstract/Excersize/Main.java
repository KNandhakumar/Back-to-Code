package com.Nandhakumar.Oops.Abstract.Excersize;

// abstract class
abstract class Animal{
    // abstract method only have in abstract classes
    // abstract method dont have body
    abstract void makeSound();
}

// when sub class extends abstract class must be override the abstract method

class Dog extends Animal{
    // override abstract method
    void makeSound(){
        System.out.println("Bark Bark");
    }
}

class Pigeon extends Animal{
    // override abstract method
    void makeSound(){
        System.out.println("It can fly");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog husky = new Dog();
        Pigeon pura = new Pigeon();
        husky.makeSound();
        pura.makeSound();
    }
}
