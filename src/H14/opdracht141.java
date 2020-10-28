package H14;

import java.awt.*;
import java.applet.*;

public class opdracht141 extends Applet {

    double r;
    String kaart [];
    String kleur [];

    public void init() {
        r = Math.random();
        kaart = new String[13];
        kleur = new String[4];
        kaart[1] = "A";
        kaart[11] = "J";
        kaart[12] = "Q";
        kaart[13] = "K";
        kleur[1] = "schoppen";
        kleur[2] = "harten";
        kleur[3] = "klaver";
        kleur[4] = "ruiten";
    }

    public void paint(Graphics g) {
        g.drawString("" + kleur + " " + kaart, 50, 60 );
    }
}
