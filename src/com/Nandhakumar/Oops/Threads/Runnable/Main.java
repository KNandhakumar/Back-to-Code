package com.Nandhakumar.Oops.Threads.Runnable;

class Nk implements Runnable {
    public void run() {
        System.out.println("Nandhakumar");
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable nk = new Nk();

        Thread thread = new Thread(nk);
        thread.start();
    }
}
