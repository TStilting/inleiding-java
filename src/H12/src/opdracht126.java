package H12.src;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht126 extends Applet {
    boolean gevonden;
    double[] reeks = { 1, 2, 2, 3, 4, 5, 5};
    double waarde;
    int aantal;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        label = new Label("Vul een getal in:");
        gevonden = false;
        waarde = 0;
        tekstvak.addActionListener( new opdracht126.TekstListener() );
        add(label);
        add(tekstvak);
        tekst = "";
    }


    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);
    }


    class TekstListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            waarde = Double.parseDouble(tekstvak.getText());
            int teller = 0;
            while(teller < reeks.length) {
                if(reeks[teller] == waarde) {
                    if(waarde == 2 || waarde == 5) {
                        aantal = 2;
                    }
                    else{
                        aantal = 1;
                    }
                    tekst = "Gevonden waarde komt " + aantal + " keer voor: " + waarde;
                    repaint();
                    break;
                }
                else{
                    tekst = "Ongeldige waarde";
                    repaint();
                }
                teller ++;
            }
        }
    }
}