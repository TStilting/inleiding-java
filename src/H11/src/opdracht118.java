import java.awt.*;
import java.applet.*;


public class opdracht118 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int x = 50;
        int y = 50;
        int w = 0;
        int h = 0;

        while(teller < 100) {
            w += 5;
            h += 5;
            g.drawOval( x, y, w, h);
            teller++;

        }
    }
}