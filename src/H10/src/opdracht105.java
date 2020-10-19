import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht105 extends Applet {
    TextField tekstvak;
    Button knopOk;
    Label label;
    String tekst, tekst1;
    double cijfer, gemiddelde, som;
    int teller;


        public void init() {
            tekstvak = new TextField("", 4);
            label = new Label("Vul cijfers in om gemiddelde uit te rekenen:");
            knopOk = new Button("Ok");
            knopOk.addActionListener( new KnopListenerOk() );
            gemiddelde = 0;
            teller = 0;
            som = 0;
            add(label);
            add(tekstvak);
            add(knopOk);
            tekst = "";
            tekst1 = "";
        }

            public void paint(Graphics g) {
                g.drawString(tekst, 50, 50);
                g.drawString("Gemiddelde: " + gemiddelde , 50, 70);
                g.drawString(tekst1, 50, 90);
            }

    class KnopListenerOk implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekst = tekstvak.getText();
            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            if ((cijfer < 6 && !(cijfer < 1))) {
                tekst = "cijfer " + cijfer + " is onvoldoende";
                teller++;
                som = som + cijfer;
                gemiddelde = som / teller;
                repaint();
            }
            if ((cijfer >= 6 && !(cijfer > 10))) {
                tekst = "cijfer " + cijfer + " is voldoende";
                teller++;
                som = som + cijfer;
                gemiddelde = som / teller;
                repaint();
            }
            if ((cijfer > 10) || (cijfer < 1)) {
                tekst = "ongeldig cijfer";
                repaint();
            }
            if (gemiddelde < 6) {
                tekst1 = "Jij bent gezakt...";
            } else {
                tekst1 = "Jij bent geslaagd!!";
            }
        }
    }
}

