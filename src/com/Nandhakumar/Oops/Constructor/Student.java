package com.Nandhakumar.Oops.Constructor;

public class Student {
    // initialize variables
    String name;
    int marks;
    // Default Constructor
    Student(){

    }
    public static void main(String[] args) {
        // creating object for Student class to access the another class methods, variables
        Student student1 = new Student();
        // creating another object for Student 2
        Student student2 = new Student();
        // initialize the values for Nk
        student1.name = "Nandhakumar";
        student1.marks = 100;
        System.out.println(student1.name + "" + " " + student1.marks);
        // initialize the values for Mami
        student2.name = "Mami Nandhakumar IAS";
        student2.marks = 100;
        System.out.println(student2.name + "" + " " + student2.marks);
    }
}
