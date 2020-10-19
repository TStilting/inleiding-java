import java.applet.Applet;
import java.awt.*;

public class TekenenRedo extends Applet {


    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 100;
        hoogte = 50;

    }

    public void paint(Graphics g) {
        g.drawLine( 20, 10, 120, 10 );
        g.drawString("Lijn", 60,23);
        g.drawRect(20, 25, breedte, hoogte);
        g.drawString("Rechthoek", 40,88);
        g.drawRoundRect(20, 90, breedte, hoogte, 30, 30);
        g.drawString("A. Rechthoek", 35,155);
        g.drawOval(240, 25, breedte, hoogte);
        g.drawString("Taartpunt + ovaal", 245,88);
        g.drawOval(265, 90, hoogte, hoogte);
        g.drawString("Cirkel", 274,155);
        g.drawString("G. rechthoek + ovaal", 120,88);
        g.drawString("G. ovaal", 155,155);

        g.setColor(opvulkleur);
        g.fillRect(130, 25, breedte, hoogte);
        g.fillOval(130, 90, breedte, hoogte);
        g.fillArc(240, 25, breedte, hoogte, 0, 45);

        g.setColor(lijnkleur);
        g.drawOval(130, 25, breedte, hoogte);
    }
}

