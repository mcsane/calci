package org.example;

public class Laskin {

    private int tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public int annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) {
        tulos = tulos * n;
    }

    public void jaa(int n) {
        tulos = tulos / n;
    }

    public void nelio(int n) {
        tulos = 2 * n;
    }

    public void neliojuuri(int n) {
        tulos = (int) Math.sqrt(n);
    }

    public void virtaON() {
        System.out.println("...Virta päälle...");
        tulos = 0;
    }

    public void virtaOFF() {
        System.out.println("...Katkaistaan virta...");
        tulos = 0;
    }

}