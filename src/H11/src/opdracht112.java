import java.awt.*;
import java.applet.*;


public class opdracht112 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 20;
        int y = 0;

        while(teller > 9) {
            y += 15;
            g.drawString("" + teller, 305, y );
            teller--;
        }
    }
}