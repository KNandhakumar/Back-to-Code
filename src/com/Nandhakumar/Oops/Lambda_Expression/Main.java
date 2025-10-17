package com.Nandhakumar.Oops.Lambda_Expression;

interface Person{
    void display();
}

public class Main {
    public static void main(String[] args) {
        // we cant create an object to interface, so we can override like this
//        Person nk = new Person() {
//            public void display() {
//                System.out.println("Nandhakumar");
//            }
//        };
//        nk.display();
        // Lambda expression
        Person nk = ()-> {
            System.out.println("Nandhakumar");
        };
        nk.display();
    }
}
