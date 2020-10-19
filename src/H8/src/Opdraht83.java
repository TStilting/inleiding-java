import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdraht83 extends Applet {
    TextField tekstvak;
    Button knopOk;
    Button knopReset;
    Label label;
    double bedrag;


    public void init() {
        tekstvak = new TextField("", 30);
        label = new Label("Vul bedrag in:");
        knopOk = new Button("Ok");
        knopReset = new Button("Reset");
        knopOk.addActionListener( new KnopListenerOk() );
        knopReset.addActionListener( new Opdraht83.KnopListenerReset() );
        add(label);
        add(tekstvak);
        add(knopOk);
        add(knopReset);



    }

    class KnopListenerOk implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            bedrag = Double.parseDouble(tekstvak.getText()) * 1.21;
            repaint();
        }
    }

    class KnopListenerReset implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            bedrag = 0.0;
            tekstvak.setText("");
            repaint();
        }
    }

    public void paint(Graphics g) {
       g.drawString("Bedrag inc. BTW: " + bedrag, 50, 50);
    }
}
