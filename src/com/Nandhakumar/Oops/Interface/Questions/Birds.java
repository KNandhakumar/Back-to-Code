package com.Nandhakumar.Oops.Interface.Questions;

interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Duck implements Flyable,Swimmable{
    public void fly(){
        System.out.println("it can fly");
    }
    public void swim(){
        System.out.println("it can swim");
    }
}

public class Birds {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
