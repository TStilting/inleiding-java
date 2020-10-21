package H13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht133 extends Applet {

    double[] steen1;
    double[] steen2;
    double[] beton1;
    double[] beton2;
    Button baksteen, beton;
    boolean uitvoerSteen, uitvoerBeton;


    public void init() {
        steen1 = new double [5];
        steen2 = new double [4];
        beton1 = new double [5];
        beton2 = new double [4];
        baksteen = new Button("Steen");
        beton = new Button("Beton");
        baksteen.addActionListener(new KnopListener());
        beton.addActionListener(new KnopListener1());
        uitvoerSteen = false;
        uitvoerBeton = false;
        add(baksteen);
        add(beton);
    }

    public void paint(Graphics g) {
        int w = 50;
        int h = 30;
        int x = 50;
        int y = 50;
        int w2 = 60;
        int h2 = 40;
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            uitvoerSteen = true;
            uitvoerBeton = false;
        }
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            uitvoerBeton = true;
            uitvoerSteen = false;
        }
    }


    void tekenSteen ( Graphics g, int x, int y, int w, int h) {
        g.setColor(Color.red);
        g.fillRect( x, y, w, h);
        g.setColor(Color.white);
        g.drawRect( x, y, w, h);

    }

    void tekenBeton ( Graphics g, int x, int y, int w2, int h2) {
        g.setColor(Color.gray);
        g.fillRect( x, y, w2, h2);
        g.setColor(Color.white);
        g.drawRect( x, y, w2, h2);

    }
}