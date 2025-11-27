package com.Nandhakumar.Oops.File_Handling.BufferedWriter;

import java.io.FileWriter;

public class BufferedWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("BufferedWriter.txt",true);
            java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
            bw.write("Nandhakumar K");
            bw.newLine();
            bw.write(" IAS");
            bw.close();
            System.out.println("success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
