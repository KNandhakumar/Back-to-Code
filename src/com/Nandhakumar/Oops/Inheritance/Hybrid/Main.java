package com.Nandhakumar.Oops.Inheritance.Hybrid;

//super class
class Birds{
    void fly(){
        System.out.println("it can fly");
    }
}

// sub class -> type Hierarchical
class Kozhi extends Birds{
    void Eat(){
        System.out.println("it can eat");
    }
}

// sub class -> Hierarchical
class Duck extends Birds{
    void Swim(){
        System.out.println("it can swim");
    }
}

// sub class -> Multi level
class Pigeon extends Kozhi {
    void Fight(){
        System.out.println("it can fight");
    }
}
// multi level and hierarchical is mixed it called hybrid inheritance
public class Main {
    public static void main(String[] args) {

    }
}
