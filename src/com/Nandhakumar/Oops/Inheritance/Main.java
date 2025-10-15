package com.Nandhakumar.Oops.Inheritance;

class Nandhakumar{
    String name = "Nandhakumar IAS";
    int age = 24;
    int salary = 100000;
    boolean MyLove = true;
}

class Mami extends Nandhakumar{

}

// mami class can access nk class via use inheritance
public class Main {
    public static void main(String[] args) {
        Mami mamitha = new Mami();
        System.out.println("mamitha" + " " + mamitha.name);
        System.out.println("mamitha Age : " + " " + mamitha.age);
        System.out.println("mamitha Salary : " + " " + mamitha.salary);
        System.out.println("mamitha Love : " + " " + mamitha.MyLove);
    }
}
