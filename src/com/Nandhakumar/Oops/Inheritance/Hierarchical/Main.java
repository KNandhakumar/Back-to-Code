package com.Nandhakumar.Oops.Inheritance.Hierarchical;
// super class
class Birds{
    void eat(){
        System.out.println("It can eat");
    }
}
// sub class
class Pigeon extends Birds{
    void fly(){
        System.out.println("It can fly");
    }
}
// sub class
class Duck extends Birds{
    void swim(){
        System.out.println("It can swim");
    }
}
// multiple subclasses inherit one super class that is hierarchical inheritance
public class Main {
    public static void main(String[] args) {
        Pigeon pura = new Pigeon();
        pura.eat();
        pura.fly();
    }
}
