package com.Nandhakumar.Java_Basics.Data_Type;

public class Main {
    public static void main(String[] args) {
        // Java data types are categorized into two min groups.
        // 1.Primitive Data Types
        // 2.Non Primitive (Reference Data Type)

        // Primitive Data Types :
                /* These are the fundamental building blocks of data manipulation in java,
        predefined by the language and named by a keyword. there are eight primitive data types*/

        // bye, short, int, long, float, double, boolean, char

        byte num = 127; // range from -128 to 127
        short num1 = 32767; // range from -32767 to 32767
        int num2 = 100;
        long num4 = 1000;
        float num5 = 10.4f; // this is floating number like, if value is 1 it will 1.0
        double num6 = 100;
        boolean Nk = true; // Represents a logical value, having only two possible values : true or false
        char mami = 'n';

        // Non Primitive (Reference) Data Type
            /* These data types are created by the programmer and are not predefined by the
            language. they refer to objects and are used to store references to memory locations
            where objects are stored. */

        // String, Arrays, Classes, Interfaces

        String name = "Nandhakumar"; // used to store sequences of characters
        // Arrays - used to store collections of elements of the same data type
        // Classes - Blueprints for creating objects,defining their properties (fields) and behaviors (methods)
        // interfaces - blueprints for classes,defining a set of methods that a class must implement
    }
}
