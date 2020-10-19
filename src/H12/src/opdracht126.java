package H12.src;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht126 extends Applet {
    // maak een tabel met 5 getallen en 2 met dezelfde waarde
    boolean gevonden;
    double[] reeks = { 1, 2, 3, 4, 5};
    double waarde;
    TextField tekstvak;
    Button Ok;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        label = new Label("Vul een getal in:");
        Ok = new Button("Ok");
        Ok.addActionListener( new opdracht126.KnopListener() );
        gevonden = false;
        waarde = 0;
        add(label);
        add(tekstvak);
        add(Ok);
        tekst = "";
    }


    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);
    }


    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

        }
    }
}