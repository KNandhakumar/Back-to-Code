package com.Nandhakumar.Oops.Inheritance.MultiLevel;
// super class or parent class
class Pigeon{
    void drink(){
        System.out.println("It can drink");
    }
}
// sub class or derived class
class Dog extends Pigeon{
    void eat(){
        System.out.println("It can eat");
    }
}
// sub class or derived class
class Fish extends Dog{
    void swim(){
        System.out.println("It can swim");
    }
}

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.drink();
        fish.eat();
        fish.swim();
    }
}
