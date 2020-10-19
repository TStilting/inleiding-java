import java.awt.*;
import java.applet.*;


public class opdracht114 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 1; teller < 11; teller++) {
            y += 30;
            g.drawString("" + teller + "x3=" + teller * 3, 305, y );
        }
    }
}