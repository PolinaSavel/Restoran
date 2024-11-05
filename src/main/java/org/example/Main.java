package org.example;

public class Main {
    public static void main(String[] args) {
        Stoliki[] stolikiKapitol = new Stoliki[4];
        stolikiKapitol[0] = new Stoliki(2, true);
        stolikiKapitol[1] = new Stoliki(4, false);
        stolikiKapitol[2] = new Stoliki(6, true);
        stolikiKapitol[3] = new Stoliki(15, true);

        Stoliki[] stolikiPerchini = new Stoliki[3];
        stolikiPerchini[0] = new Stoliki(3, true);
        stolikiPerchini[1] = new Stoliki(5, true);
        stolikiPerchini[2] = new Stoliki(4, false);

        Restoran[] restorans = new Restoran[2];
        restorans[0] = new Restoran("Kapitol", stolikiKapitol);
        restorans[1] = new Restoran("Perchini", stolikiPerchini);

        RestoranService restoranService = new RestoranService();
        restoranService.pechataemSvobodnieMesta(restorans);
    }
}