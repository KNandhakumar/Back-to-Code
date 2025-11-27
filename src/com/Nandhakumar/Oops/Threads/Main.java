package com.Nandhakumar.Oops.Threads;

class A extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Nandhakumar IAS");
            try {
                // this will help to sleep some milli seconds
                sleep(10);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Mamitha");
            try {
                // this will help to sleep some milli seconds
                sleep(10);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        // we can set priority for every class for higher chance to run that method
        a.setPriority(10);
        a.start();
        B b = new B();
        b.start();
    }
}
