package com.Nandhakumar.Oops.SuperKeyword.Excersize;

class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}

class Employee extends Person{
    int employeeId;

    Employee(String name){
        super(name);
    }
}


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Nandhakumar");
        System.out.println(employee.name);
    }
}
