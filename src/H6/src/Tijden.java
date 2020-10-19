import java.applet.Applet;
import java.awt.*;

    public class Tijden extends Applet {
        int seconde;
        int uur;
        int dag;
        int jaar;

        public void init() {
            seconde = 1;
            uur = seconde * 60 * 60;
            dag = uur * 24;
            jaar = dag * 365;
        }

        public void paint(Graphics g) {
            g.drawString("De uitkomst is: ", 20, 20);
            g.drawString("seconden in een uur: " + uur, 20, 35);
            g.drawString("seconden in een dag: " + dag, 20, 50);
            g.drawString("seconden in een jaar: " + jaar, 20, 65);
        }
    }
