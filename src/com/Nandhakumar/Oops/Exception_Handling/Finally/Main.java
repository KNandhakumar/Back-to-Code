package com.Nandhakumar.Oops.Exception_Handling.Finally;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        }
        catch (Exception e){
            System.out.println(e);
        }
        // finally is always run whether exception occur or not
        finally {
            System.out.println("always run im finally");
        }
    }
}
