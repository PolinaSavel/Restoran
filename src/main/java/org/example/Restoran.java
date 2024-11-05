package org.example;

public class Restoran {
    private String name;
    private Stoliki[] stoliki;

    public Restoran(String name, Stoliki[] stoliki) {
        this.name = name;
        this.stoliki = stoliki;
    }

    public String getName() {
        return name;
    }

    public Stoliki[] getStoliki() {
        return stoliki;
    }
}
