package com.Nandhakumar.Oops.AccessModifiers.Question;

class Person{
    public String name; // public property can use everywhere
    protected int age; // can use only same package and sub classes
    private int socialSecurityNumber; // can only use in same class
    String address; // can use in only same package
    // Person constructor
    Person(String name,int age,int secureNumber,String address){
        this.name = name;
        this.age = age;
        this.socialSecurityNumber = secureNumber;
        this.address = address;
    }
    // display method for access the private field (variable)
    void display(){
        System.out.println("socialSecurityNumber : " + socialSecurityNumber);
    }
}

class Employee extends Person{
    Employee(String name,int age,int secureNumber,String address){
        super(name,age,secureNumber,address); // call parent class using super keyword
    }
}

public class Main {
    public static void main(String[] args) {
        // creating object for Employee class
        Employee employee = new Employee("Nandhakumar",24,2001,"Tiruvallur");
        // try to access public property using emp object
        // public can be use everywhere
        System.out.println("Name : " + employee.name);
        // try to access protected property using emp object
        // protected can be use only same package or sub classes
        System.out.println("Age : " + employee.age);
        // try to access private property using emp object
        // cannot be access the private property only access the same class
        // try to access using call the method
        employee.display(); // it showing the private property using while method
//        System.out.println("socialSecurityNumber : " + employee.socialSecurityNumber);
        // default can be access only same package
        System.out.println("Address : " + employee.address);
    }
}
