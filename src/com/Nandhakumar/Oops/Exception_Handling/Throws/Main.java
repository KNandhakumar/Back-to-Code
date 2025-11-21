package com.Nandhakumar.Oops.Exception_Handling.Throws;

class Calc {
    void calc() throws Exception{
        int a = 10/0;
    }
}

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        try {
            calc.calc();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
