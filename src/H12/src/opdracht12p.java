package H12.src;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht12p extends Applet {

    //String[] reeks;
    TextField tekstvak;
    Button Ok;
    Label label;
    String[] tekst;

    public void init() {
        tekst = new String [10];
        tekstvak = new TextField("", 15);
        label = new Label("voer naam en nummer in");
        Ok = new Button("Ok");
        Ok.addActionListener(new opdracht12p.KnopListener());
        add(label);
        add(tekstvak);
        add(Ok);
    }


    public void paint(Graphics g) {
        g.drawString(tekst[1], 50, 50);
        g.drawString(tekst[2], 50, 60);
        g.drawString(tekst[3], 50, 70);
        g.drawString(tekst[4], 50, 80);
        g.drawString(tekst[5], 50, 90);
        g.drawString(tekst[6], 50, 100);
        g.drawString(tekst[7], 50, 110);
        g.drawString(tekst[8], 50, 120);
        g.drawString(tekst[9], 50, 130);
        g.drawString(tekst[10], 50, 140);
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {




        }
    }
}