package H13;

import java.awt.*;
import java.applet.*;

public class opdracht13p extends Applet {

    double[] boom;

    public void init() {
        boom = new double [7];
    }

    public void paint(Graphics g) {
        int w = 30;
        int h = 35;
        int x = 56;
        int y = 50;
        int x1 = 70;
        int y1 = 100;
        int x2 = 70;
        int y2 = 70;

        for (int teller = 0; teller < boom.length; teller++) {
            tekenBoom(g, x1, y1, x2, y2, x, y, w, h);
            x += 40;
            x1 += 40;
            x2 += 40;
        }
        x = 56;
        x1 = 70;
        x2 = 70;
        y += 60;
        y1 += 60;
        y2 += 60;

        for (int teller = 0; teller < boom.length; teller++) {
            tekenBoom(g, x1, y1, x2, y2, x, y, w, h);
            x += 40;
            x1 += 40;
            x2 += 40;
        }
    }


    void tekenBoom ( Graphics g, int x1, int y1, int x2, int y2, int x, int y, int w, int h) {
        g.setColor(Color.lightGray);
        g.drawLine( x1, y1, x2, y2);
        g.setColor(Color.green);
        g.fillOval( x, y, w, h);

    }
}