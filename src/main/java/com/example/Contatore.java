package com.example;

public class Contatore {
    private int valore = 0;

    public synchronized void incrementa() {
        valore++;
    }

    public int getValore() {
        return valore;
    }
}