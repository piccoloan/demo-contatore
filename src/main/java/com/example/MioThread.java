package com.example;

public class MioThread extends Thread {
    private Contatore contatore;

    public MioThread(Contatore c) {
        this.contatore = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            contatore.incrementa();
        }
    }
}