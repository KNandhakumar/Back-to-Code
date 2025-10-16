package com.Nandhakumar.Oops.Abstract;
// abstract class
abstract class Animal{
    // abstract method only have in abstract class
    // abstract method dont have body
    // sub class must override abstract class methods
    abstract void makeSound();

    void eat(){
        System.out.println("It can eat");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog husky = new Dog();
        husky.eat();
        husky.makeSound();
    }
}
