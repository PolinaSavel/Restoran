package org.example;

public class RestoranService {
    public void pechataemSvobodnieMesta(Restoran[] restoran) {
        for (int i =0; i<restoran.length; i++) {
            System.out.println("Restoran: " + restoran[i].getName());
            for (Stoliki stolik : restoran[i].getStoliki()) {
                System.out.println("  Stolik: " + stolik.getKol_voMest() + ", Svoboden: " + (stolik.isSvoboden() ? "Yes" : "No"));
            }
        }
    }
}
