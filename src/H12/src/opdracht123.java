package H12.src;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class opdracht123 extends Applet {
    TextField[] tekstvak;
    Button knop;
    Label label;
    String test;

    public void init() {
        label = new Label("Vul in alle tekstvakken een getal in:");
        add(label);
        tekstvak = new TextField[5];

        for (int teller = 0; tekstvak.length > teller; teller ++) {
            tekstvak[teller] = new TextField("", 5);
            add(tekstvak[teller]);
        }
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(knop);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            test = tekstvak[0].getText();
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString(test, 50, 100);
        }
}