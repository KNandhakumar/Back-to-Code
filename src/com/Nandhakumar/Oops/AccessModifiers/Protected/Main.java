package com.Nandhakumar.Oops.AccessModifiers.Protected;

// super class
class Vehicle{
    protected void startEngine(){
        System.out.println("this is protected");
    }
}

// sub class
class Car extends Vehicle{

}

// protected only accessible in same package and sub classes
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
    }
}
