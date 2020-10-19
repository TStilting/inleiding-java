import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht1111 extends Applet {
    Button knopOk;
    Label label;
    int tafel;


    public void init() {
        label = new Label("Druk in voor tafels:");
        knopOk = new Button("Ok");
        knopOk.addActionListener(new KnopListenerOk());
        add(label);
        add(knopOk);
        tafel = 1;


    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 1; teller < 11; teller++) {
            y += 30;
            g.drawString("" + teller + "x" + tafel + "=" + teller * tafel, 60, y);
        }
    }

    class KnopListenerOk implements ActionListener {
        public void actionPerformed(ActionEvent e) {
               tafel = tafel + 1;
                repaint();
            }
        }
    }

