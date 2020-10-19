import java.applet.Applet;
import java.awt.*;

public class figuren {

    public static class Show extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.white);
            g.setColor(Color.black);
            g.drawLine( 20, 10, 120, 10 );
            g.drawString("Lijn", 60,23);
            g.drawRect(20, 25, 100, 50);
            g.drawString("Rechthoek", 40,88);
            g.drawRoundRect(20, 90, 100, 50, 30, 30);
            g.drawString("A. Rechthoek", 35,155);
            g.drawOval(240, 25, 100, 50);
            g.drawString("Taartpunt + ovaal", 245,88);
            g.drawOval(265, 90, 50, 50);
            g.drawString("Cirkel", 274,155);
            g.drawString("G. rechthoek + ovaal", 120,88);
            g.drawString("G. ovaal", 155,155);

            g.setColor(Color.MAGENTA);
            g.fillRect(130, 25, 100, 50);
            g.fillOval(130, 90, 100, 50);
            g.fillArc(240, 25, 100, 50, 0, 45);

            g.setColor(Color.BLACK);
            g.drawOval(130, 25, 100, 50);
        }
    }
}
