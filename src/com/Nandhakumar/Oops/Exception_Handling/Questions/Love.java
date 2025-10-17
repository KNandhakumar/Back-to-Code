package com.Nandhakumar.Oops.Exception_Handling.Questions;

public class Love {
    public static void main(String[] args) {
        boolean love = true;
        String partnerName = "Mamitha";
        try{
            if (love){
                if (partnerName=="Mamitha"){
                    System.out.println(partnerName + " you are something special for me");
                }
            }
            else {
                System.out.println(partnerName + " : good soul");
            }
        }
        catch (Exception e){
            System.out.println("Exception handled : Nandhakumar your love is not true so leave it mamitha");
        }
        finally {
            System.out.println("we will definitely live as friends");
        }
    }
}
