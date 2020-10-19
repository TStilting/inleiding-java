import java.applet.Applet;
import java.awt.*;

    public class Karwei extends Applet {
        int totaal;
        int aantal;
        int uitkomst;

        public void init() {
            totaal = 113;
            aantal = 4;
            uitkomst = totaal / aantal;
        }

        public void paint(Graphics g) {
            g.drawString("De uitkomst is: ", 20, 20);
            g.drawString("Jan krijgt: " + uitkomst, 20, 35);
            g.drawString("Ali krijgt: " + uitkomst, 20, 50);
            g.drawString("Jeannette krijgt: " + uitkomst, 20, 65);
            g.drawString("ikzelf krijg: " + uitkomst, 20, 80);
        }
    }
