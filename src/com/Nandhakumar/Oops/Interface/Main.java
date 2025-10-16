package com.Nandhakumar.Oops.Interface;

// interface is used for achieving abstraction and multiple inheritance
interface Details{
    int age = 24; // static final variable inside interface
    void job(); // abstraction method don't need body in interface
}

class Nandhakumar implements Details{
    public void personalDetails(String name){
        System.out.print("Name : " + name + " , Age : " + age + " , Profession : ");
    }
    // overriding interface abstraction method
    public void job(){
        System.out.println("IAS");
    }
}

class Mami implements Details{
    public void personalDetails(String name){
        System.out.print("Name : " + name + " , Age : " + age + " , Profession : ");
    }
    public void job(){
        System.out.println("Dancer and Singer");
    }
}

public class Main {
    public static void main(String[] args) {
        // creating object for Nk
        Nandhakumar nk = new Nandhakumar();
        nk.personalDetails("Nandhakumar");
        nk.job();
        // creating object for Mami
        Mami Mamitha = new Mami();
        Mamitha.personalDetails("Mamitha IAS");
        Mamitha.job();
    }
}
