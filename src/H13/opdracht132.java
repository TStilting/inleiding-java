package H13;

import java.awt.*;
import java.applet.*;

public class opdracht132 extends Applet {

    double[] steen;
    double[] steen1;

    public void init() {
        steen = new double [5];
        steen1 = new double [4];
    }

    public void paint(Graphics g) {
        int w = 50;
        int h = 30;
        int x = 50;
        int y = 50;
        for (int teller = 0; teller < steen.length; teller++) {
            tekenSteen (g, x, y, w, h);
            x += 50;
        }
        x = 75;
        y += 30;
        for (int teller = 0; teller < steen1.length; teller++) {
            tekenSteen (g, x, y, w, h);
            x += 50;
        }
        x = 50;
        y += 30;
        for (int teller = 0; teller < steen.length; teller++) {
            tekenSteen (g, x, y, w, h);
            x += 50;
        }
        x = 75;
        y += 30;
        for (int teller = 0; teller < steen1.length; teller++) {
            tekenSteen (g, x, y, w, h);
            x += 50;
        }
        x = 50;
        y += 30;
        for (int teller = 0; teller < steen.length; teller++) {
            tekenSteen (g, x, y, w, h);
            x += 50;
        }

    }


    void tekenSteen ( Graphics g, int x, int y, int w, int h) {
        g.setColor(Color.red);
        g.fillRect( x, y, w, h);
        g.setColor(Color.white);
        g.drawRect( x, y, w, h);

    }
}