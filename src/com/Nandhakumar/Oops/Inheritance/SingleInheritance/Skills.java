package com.Nandhakumar.Oops.Inheritance.SingleInheritance;
// super class or parent class
class Nandhakumar{
    void coding(){
        System.out.println("I can coding");
    }
}
// Derived class or subclass
class Mami extends Nandhakumar{
    void dance(){
        System.out.println("Dancer");
    }
}
// one super class one derived class is called single inheritance
public class Skills {
    public static void main(String[] args) {
        Mami mamitha = new Mami();
        mamitha.coding();
        mamitha.dance();
    }
}
