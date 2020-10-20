package H12.src;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht12p extends Applet {

    double[] reeks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Button Ok;
    Label label;
    String tekst;

    public void init() {
        label = new Label("Druk in voor nummers");
        Ok = new Button("Ok");
        Ok.addActionListener(new opdracht12p.KnopListener());
        add(label);
        add(Ok);
        tekst = "";
    }


    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int teller = 0;



        }
    }
}
