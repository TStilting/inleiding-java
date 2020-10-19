import java.applet.Applet;
import java.awt.*;


public class Gemiddelde extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double midden;
    double afkappen;
    double terug;

    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        midden = (cijfer1 + cijfer2 + cijfer3) / 3;
        afkappen = (int) (midden * 10);
        terug = afkappen / 10;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + terug, 20, 20);
    }
}