package com.Nandhakumar.Oops.StaticKeyword;

class MathUtils{
    static int add(int a, int b){
        return a+b;
    }
}

// static method we can access without an object
public class StaticMethod {
    public static void main(String[] args) {
        System.out.println(MathUtils.add(10,10));
    }
}
