import java.awt.*;
        import java.applet.*;


public class Applet2 extends java.applet.Applet {




    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Troy", 250, 220 );
        g.setColor(Color.red);
        g.drawString("Stilting", 250, 235 );}
}