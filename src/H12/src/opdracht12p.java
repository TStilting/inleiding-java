package H12.src;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht12p extends Applet {

    TextField tekstvak, tekstvak1;
    Button Ok;
    Label label;
    String[] naam;
    String[] nummer;

    public void init() {
        naam = new String [10];
        nummer = new String [10];
        tekstvak = new TextField("", 10);
        tekstvak1 = new TextField("", 10);
        label = new Label("voer naam en nummer in");
        Ok = new Button("Ok");
        Ok.addActionListener(new opdracht12p.KnopListener());
        add(label);
        add(tekstvak);
        add(tekstvak1);
        add(Ok);
    }


    public void paint(Graphics g) {
        g.drawString(naam[0] + "  " + nummer[0], 50, 40);
        g.drawString(naam[1] + "  " + nummer[1], 50, 50);
        g.drawString(naam[2] + "  " + nummer[2], 50, 60);
        g.drawString(naam[3] + "  " + nummer[3], 50, 70);
        g.drawString(naam[4] + "  " + nummer[4], 50, 80);
        g.drawString(naam[5] + "  " + nummer[5], 50, 90);
        g.drawString(naam[6] + "  " + nummer[6], 50, 100);
        g.drawString(naam[7] + "  " + nummer[7], 50, 110);
        g.drawString(naam[8] + "  " + nummer[8], 50, 120);
        g.drawString(naam[9] + "  " + nummer[9], 50, 130);
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
         int teller = 0;


                naam[teller] = tekstvak.getText();


                nummer[teller] = tekstvak1.getText();
            teller++;
            repaint();
        }
    }
}