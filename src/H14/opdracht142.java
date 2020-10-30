package H14;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class opdracht142 extends Applet {

    double r;
    String[] kaart;
    String[] kleur;
    String[] deck;

    public void init() {
        r = Math.random();
        kaart = new String[14];
        kleur = new String[5];
        deck = new String[52];
        kleur[(int) r] = String.valueOf((int)(r * 4 + 1));
        kaart[(int) r] = String.valueOf((int)(r * 13 + 1));
        deck[(int) r] = String.valueOf((int)(r * 52 + 1));
    }


    public void paint(Graphics g) {

        if (kaart[(int) r].equals(String.valueOf(1))) {
            kaart[(int) r] = "A";
        }

        if (kaart[(int) r].equals(String.valueOf(11))) {
            kaart[(int) r] = "J";
        }

        if (kaart[(int) r].equals(String.valueOf(12))) {
            kaart[(int) r] = "Q";
        }

        if (kaart[(int) r].equals(String.valueOf(13))) {
            kaart[(int) r] = "K";
        }

        if (kleur[(int) r].equals(String.valueOf(1))) {
            kleur[(int) r] = "schoppen";
        }

        if (kleur[(int) r].equals(String.valueOf(2))) {
            kleur[(int) r] = "klaver";
        }

        if (kleur[(int) r].equals(String.valueOf(3))) {
            kleur[(int) r] = "harten";
        }

        if (kleur[(int) r].equals(String.valueOf(4))) {
            kleur[(int) r] = "ruiten";
        }

        g.drawString(kleur[(int) r] + " " + kaart[(int) r], 50, 60);
    }

    private void deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart1 = deck[random];

        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
    }
}
