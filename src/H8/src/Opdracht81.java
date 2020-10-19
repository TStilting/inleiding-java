import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht81 extends Applet {
    TextField tekstvak;
    Button knopOk;
    Button knopReset;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 30);
        label = new Label("Vul iets in:");
        knopOk = new Button("Ok");
        knopReset = new Button("Reset");
        knopOk.addActionListener( new KnopListenerOk() );
        knopReset.addActionListener( new KnopListenerReset() );
        add(label);
        add(tekstvak);
        add(knopOk);
        add(knopReset);
        tekst = "";
    }

    class KnopListenerOk implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekst = tekstvak.getText();
            repaint();
        }
    }

    class KnopListenerReset implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekst = "";
            tekstvak.setText("");
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);
    }
}
