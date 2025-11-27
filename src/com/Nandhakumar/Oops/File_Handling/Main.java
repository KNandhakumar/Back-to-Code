package com.Nandhakumar.Oops.File_Handling;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        // Filewriter is a java class used for writing character data to a file. it is  part of the java.
        // io package and is commonly used when you need to write plain text to a file.
        try {
            FileWriter fw = new FileWriter("output.txt",true);
            fw.append("IAS");
            fw.close();
            System.out.println("success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
