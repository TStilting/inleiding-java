package H14;

import java.awt.*;
import java.applet.*;

public class opdracht141 extends Applet {

    double r;
    String[] kaart;
    String[] kleur;

    public void init() {
        r = Math.random();
        kaart = new String[14];
        kleur = new String[5];
        kaart[1] = "A";
        kaart[2] = "2";
        kaart[3] = "3";
        kaart[4] = "4";
        kaart[5] = "5";
        kaart[6] = "6";
        kaart[7] = "7";
        kaart[8] = "8";
        kaart[9] = "9";
        kaart[10] = "10";
        kaart[11] = "J";
        kaart[12] = "Q";
        kaart[13] = "K";
        kleur[1] = "schoppen";
        kleur[2] = "harten";
        kleur[3] = "klaver";
        kleur[4] = "ruiten";
        kleur[(int) r] = String.valueOf((int)(r * 4 + 1));
        kaart[(int) r] = String.valueOf((int)(r * 13 + 1));
    }

    public void paint(Graphics g) {
        g.drawString( kleur[(int) r] + " " + kaart[(int) r], 50, 60 );
    }
}
