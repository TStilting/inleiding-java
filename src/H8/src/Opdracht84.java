import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht84 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button plus;
    Button min;
    Button keer;
    Button deel;

    public void init() {
        tekstvak1 = new TextField("", 30);
        tekstvak2 = new TextField("", 30);
        plus = new Button("+");
        min = new Button("-");
        keer = new Button("*");
        deel = new Button("/");
        plus.addActionListener( new Opdracht84.KnopListenerplus() );
        min.addActionListener( new Opdracht84.KnopListenermin() );
        keer.addActionListener( new Opdracht84.KnopListenerkeer() );
        deel.addActionListener( new Opdracht84.KnopListenerdeel() );
        add(tekstvak1);
        add(tekstvak2);
        add(plus);
        add(min);
        add(keer);
        add(deel);
    }

    class KnopListenerplus implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak1.setText(String.valueOf(Double.parseDouble(tekstvak1.getText()) + Double.parseDouble(tekstvak2.getText())));
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopListenermin implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak1.setText(String.valueOf(Double.parseDouble(tekstvak1.getText()) - Double.parseDouble(tekstvak2.getText())));
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopListenerkeer implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak1.setText(String.valueOf(Double.parseDouble(tekstvak1.getText()) * Double.parseDouble(tekstvak2.getText())));
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopListenerdeel implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak1.setText(String.valueOf(Double.parseDouble(tekstvak1.getText()) / Double.parseDouble(tekstvak2.getText())));
            tekstvak2.setText("");
            repaint();
        }
    }
}
