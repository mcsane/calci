package org.example;



import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class LaskinTest {

    @Test
    void nollaa() {
        Laskin laskin = new Laskin();
        laskin.lisaa(500);
        laskin.nollaa();
        assertEquals(0, laskin.annaTulos());
    }

    @Test
    void annaTulos() {
        Laskin laskin = new Laskin();
        laskin.lisaa(500);
        laskin.lisaa(200);
        assertEquals(700, laskin.annaTulos());
    }

    @Test
    void lisaa() {
        Laskin laskin = new Laskin();
        laskin.lisaa(500);
        assertEquals(500, laskin.annaTulos());
    }

    @Test
    void vahenna() {
        Laskin laskin = new Laskin();
        laskin.lisaa(500);
        laskin.vahenna(200);
        assertEquals(300, laskin.annaTulos());
    }

    @Test
    void kerro() {
        Laskin laskin = new Laskin();
        laskin.lisaa(500);
        laskin.kerro(2);
        assertEquals(1000, laskin.annaTulos());
    }

    @Test
    void jaa() {
        Laskin laskin = new Laskin();
        laskin.lisaa(500);
        laskin.jaa(2);
        assertEquals(250, laskin.annaTulos());
    }

    @Test
    void nelio() {
        Laskin laskin = new Laskin();
        laskin.nelio(5);
        assertEquals(10, laskin.annaTulos());
    }

    @Test
    void neliojuuri() {
        Laskin laskin = new Laskin();
        laskin.neliojuuri(25);
        assertEquals(5, laskin.annaTulos());
    }

    @Test
    void virtaON() {
        Laskin laskin = new Laskin();
        laskin.virtaON();
        assertEquals(0, laskin.annaTulos());
    }

    @Test
    void virtaOFF() {
        Laskin laskin = new Laskin();
        laskin.virtaOFF();
        assertEquals(0, laskin.annaTulos());
    }
}