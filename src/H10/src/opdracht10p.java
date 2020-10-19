import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht10p extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;
    double cijfer;


    public void init() {
        tekstvak = new TextField("", 4);
        label = new Label("Vul cijfer in:");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        tekst = "";
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekst = tekstvak.getText();
            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            if ((cijfer < 4 && !(cijfer < 1))) {
                tekst = "" + cijfer + " is slecht";
                repaint();
            }
            if ((cijfer < 6 && !(cijfer < 4))) {
                tekst = "" + cijfer + " is onvoldoende";
                repaint();
            }
            if ((cijfer < 8 && !(cijfer < 6))) {
                tekst = "" + cijfer + " is voldoende";
                repaint();
            }
            if ((cijfer <= 10 && !(cijfer < 8))) {
                tekst = "" + cijfer + " is goed";
                repaint();
            }
            if ((cijfer < 1 || (cijfer > 10))) {
                tekst = "ongeldig cijfer";
                repaint();
            }
        }
    }
}