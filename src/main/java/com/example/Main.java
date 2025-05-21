package com.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Contatore c = new Contatore();
        Thread t1 = new MioThread(c);
        Thread t2 = new MioThread(c);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Valore finale (senza sincronizzazione): " + c.getValore());
    }
}