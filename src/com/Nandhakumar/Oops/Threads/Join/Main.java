package com.Nandhakumar.Oops.Threads.Join;

class A extends Thread {
    int j = 0;
    public void run() {
        for (int i = 0; i < 50; i++) {
            j = i;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        try {
            a.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(a.j);
    }
}
