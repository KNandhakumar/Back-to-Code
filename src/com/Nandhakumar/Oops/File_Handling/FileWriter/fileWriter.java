package com.Nandhakumar.Oops.File_Handling.FileWriter;

import java.io.FileWriter;

public class fileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("fileWriterTest.txt",true);
            fw.append(" IAS");
            fw.close();
            System.out.println("success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
