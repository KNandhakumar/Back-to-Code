package com.Nandhakumar.Oops.Interface.Questions;

interface Playable{
    void play();
}

class Guitar implements Playable{
    public void play(){
        System.out.println("playing guitar");
    }
}

class Piano implements Playable{
    public void play(){
        System.out.println("playing piano");
    }
}

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();
        Piano piano = new Piano();
        piano.play();
    }
}
