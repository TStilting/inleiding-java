import java.applet.Applet;
import java.awt.*;


public class opdracht113 extends Applet {

    int a, b, c;

    public void init() {
        a = 0;
        b = 1;
        c = a + b;

    }

    public void paint(Graphics g) {
        int x = 20;

        while(c < 1000) {
            a = b;
            b = c;
            c = a + b;
            x += 25;
            g.drawString("" + c, x, 60 );
        }
    }
}