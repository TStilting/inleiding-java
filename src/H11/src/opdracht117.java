import java.awt.*;
import java.applet.*;


public class opdracht117 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int x = 500;
        int y = 500;
        int w = 0;
        int h = 0;

        while(teller < 50) {
            x -= 5;
            y -= 5;
            w += 10;
            h += 10;
            g.drawOval( x, y, w, h);
            teller++;

        }
    }
}