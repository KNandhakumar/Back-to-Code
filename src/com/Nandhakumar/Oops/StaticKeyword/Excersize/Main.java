package com.Nandhakumar.Oops.StaticKeyword.Excersize;

class Counter{
    static int count;
    int instanceNumber;

    // Counter constructor
    Counter(){
        count = count+1;
        instanceNumber = instanceNumber+1;
    }

    void display(){
        System.out.println("count : " + count);
        System.out.println("instance number : " + instanceNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.display();
        Counter c2 = new Counter();
        c2.display();
        Counter c3 = new Counter();
        c3.display();
    }
}
