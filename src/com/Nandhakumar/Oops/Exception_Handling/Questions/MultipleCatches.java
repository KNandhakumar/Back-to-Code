package com.Nandhakumar.Oops.Exception_Handling.Questions;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
            // array index out of bound exception
            int[] arr = {1, 2, 3};
            System.out.println("accessing element : " + arr[5]); // invalid index

            // arithmetic exception
            int a = 10, b = 0;
            int result = a/b;
            System.out.println("result : " + result);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error : array index is out of bounds : " + e);
        }
        catch (ArithmeticException e){
            System.out.println("Error : Division by zero is not allowed : " + e);
        }
        catch (Exception e){
            System.out.println("som other exception occured : " + e);
        }
    }
}
