package org.example;

public class Stoliki {
    private int kol_voMest;
    private boolean svoboden;

    public Stoliki(int kol_voMest, boolean svoboden) {
        this.kol_voMest = kol_voMest;
        this.svoboden = svoboden;
    }

    public int getKol_voMest() {
        return kol_voMest;
    }

    public boolean isSvoboden() {
        return svoboden;
    }
}