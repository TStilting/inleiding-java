package H12.src;

import java.awt.*;
import java.applet.*;

public class opdracht121 extends Applet {

    double[] getal;
    double som;

    public void init() {
        getal = new double [10];

        for (int teller = 0; teller < getal.length; teller ++) {
            getal[teller] = 10 * teller + 10;
            som = getal[0] + getal[1] + getal[2] + getal[3] + getal[4] + getal[5] + getal[6] + getal[7] + getal[8] + getal[9];
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getal.length; teller++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            g.drawString("Gemiddelde: " + som / 10, 150, 20);
        }

    }
}