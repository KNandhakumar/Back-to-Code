package com.Nandhakumar.Oops.Final.Final_Method_Parameter;

class Employee{
    void display(final int num){
        // num = num + 1; // cannot assign a value to final method parameter
        System.out.println(num);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.display(10);
    }
}
