package com.Nandhakumar.Oops.AccessModifiers.Default;

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    void display(){
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student nk = new Student("Nandhakumar");
        nk.display();
    }
}
