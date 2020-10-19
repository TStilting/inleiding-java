import java.awt.*;
import java.applet.*;


public class opdracht111 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller < 10; teller++) {
            x += 30;
            g.drawLine( x ,30 , x, 360  );
        }
    }
}