package com.Nandhakumar.Java_Basics.Day_3.Methods;

public class GardenProgram {
    int applePrice = 20;
    int count = 5;
    void total(){
        System.out.println(applePrice* count);
    }
    public static void main(String[] args) {
        GardenProgram garden = new GardenProgram();
        garden.total();
    }
}
