package com.Nandhakumar.Oops.AccessModifiers.Public;

class Person{
    public String name;
    Person(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Civilians hero");
    }
}

public class Main {
    public static void main(String[] args) {
        Person nk = new Person("Nandhakumar");
        System.out.println(nk.name);
        nk.display();
    }
}
