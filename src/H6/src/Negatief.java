import java.applet.Applet;
import java.awt.*;


    public class Negatief extends Applet {
        int nee;
        int gatief;
        int indemin;

        public void init() {
            nee = 2147483647;
            gatief = 4;
            indemin = nee + gatief;
        }

        public void paint(Graphics g) {
            g.drawString("De uitkomst is: " + indemin, 20, 20);
        }
    }