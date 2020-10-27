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
    Graphics gr;
    int w = 50;
    int h = 30;
    int x = 50;
    int y = 50;
    int w2 = 60;
    int h2 = 40;
    int x2 = 350;


    public void init() {
        steen1 = new double [5];
        steen2 = new double [4];
        beton1 = new double [5];
        beton2 = new double [4];
        gr = getGraphics();
        baksteen = new Button("Steen");
        beton = new Button("Beton");
        baksteen.addActionListener(new KnopListener());
        beton.addActionListener(new KnopListener1());
        add(baksteen);
        add(beton);
    }

    public void paint(Graphics g) {}

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int teller = 0; teller < steen1.length; teller++) {
                tekenSteen (gr, x, y, w, h);
                x += 50;
            }
            x = 75;
            y += 30;
            for (int teller = 0; teller < steen2.length; teller++) {
                tekenSteen (gr, x, y, w, h);
                x += 50;
            }
            x = 50;
            y += 30;
            for (int teller = 0; teller < steen1.length; teller++) {
                tekenSteen (gr, x, y, w, h);
                x += 50;
            }
            x = 75;
            y += 30;
            for (int teller = 0; teller < steen2.length; teller++) {
                tekenSteen (gr, x, y, w, h);
                x += 50;
            }
            x = 50;
            y += 30;
            for (int teller = 0; teller < steen1.length; teller++) {
                tekenSteen (gr, x, y, w, h);
                x += 50;
            }
            x = 50;
            y = 50;

        }
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int teller = 0; teller < beton1.length; teller++) {
                tekenBeton (gr, x2, y, w2, h2);
                x2 += 60;
            }
            x2 = 375;
            y += 40;
            for (int teller = 0; teller < beton2.length; teller++) {
                tekenBeton (gr, x2, y, w2, h2);
                x2 += 60;
            }
            x2 = 350;
            y += 40;
            for (int teller = 0; teller < beton1.length; teller++) {
                tekenBeton (gr, x2, y, w2, h2);
                x2 += 60;
            }
            x2 = 375;
            y += 40;
            for (int teller = 0; teller < beton2.length; teller++) {
                tekenBeton (gr, x2, y, w2, h2);
                x2 += 60;
            }
            x2 = 350;
            y += 40;
            for (int teller = 0; teller < beton1.length; teller++) {
                tekenBeton (gr, x2, y, w2, h2);
                x2 += 60;
            }
            x2 = 350;
            y = 50;
        }
    }




    void tekenSteen(Graphics gr, int x, int y, int w, int h) {
        this.gr.setColor(Color.red);
        gr.fillRect( x, y, w, h);
        gr.setColor(Color.white);
        gr.drawRect( x, y, w, h);

    }

    void tekenBeton(Graphics gr, int x2, int y, int w2, int h2) {
        gr.setColor(Color.gray);
        gr.fillRect( x2, y, w2, h2);
        gr.setColor(Color.white);
        gr.drawRect( x2, y, w2, h2);

    }

}