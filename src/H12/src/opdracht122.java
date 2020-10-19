package H12.src;

import java.awt.*;
import java.applet.*;

public class opdracht122 extends Applet {

    Button[] knop;

    public void init() {

        knop = new Button[25];

        for (int teller = 0; knop.length > teller; teller ++) {
            knop[teller] = new Button("Knop");
            add(knop[teller]);
        }
    }
    public void paint(Graphics g) {
        g.drawString("Note: deze knoppen werken niet.", 50, 150);
    }
}