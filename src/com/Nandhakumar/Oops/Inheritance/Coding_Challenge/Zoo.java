package com.Nandhakumar.Oops.Inheritance.Coding_Challenge;
// super class
class Animal{
    String name;
    int age;
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
// sub class
class Dog extends Animal{
    String breed;
    // override function
    void makeSound(){
        System.out.println("dog barks");
    }
    void fetch(){
        System.out.println("dog is fetching");
    }
}

// sub class
class Husky extends Animal{
    String color;
    void makeSound(){
        System.out.println("very sound barking");
    }
    void Cold(){
        System.out.println("husky can survive low degree celsius");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Dog beagle = new Dog();
        beagle.makeSound();
        Husky husky = new Husky();
        husky.makeSound();
    }
}
