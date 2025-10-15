package com.Nandhakumar.Oops.Constructor.ParameterizedConstructor;

public class Student {
    String name;
    int age;

    Student(String name,int age){
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        // creating object for nk and values passing by using constructor parameter
        Student student1 = new Student("Nandhakumar",23);
        // creating object for Mami and values passing by using constructor parameter
        Student student2 = new Student("Mami Nandhakumar IAS",23);
        // this instead of try to values pass in parameters
        // student1.name = "Nandhakumar";
        // student1.age = 23;
    }
}
