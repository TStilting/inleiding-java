import java.awt.*;
import java.applet.*;


public class Applet extends java.applet.Applet {




    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Troy", 250, 220 );}
}
