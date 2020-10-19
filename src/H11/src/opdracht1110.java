import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht1110 extends Applet {
    TextField tekstvak;
    Button knopOk;
    Label label;
    int tafel;


    public void init() {
        tekstvak = new TextField("", 2);
        label = new Label("Vul tafel in:");
        knopOk = new Button("Ok");
        knopOk.addActionListener(new KnopListenerOk());
        add(label);
        add(tekstvak);
        add(knopOk);
        tafel = 0;


    }

    class KnopListenerOk implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel = (int) Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }



    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 1; teller < 11; teller++) {
            y += 30;
            g.drawString("" + teller + "x" + tafel + "=" + teller * tafel, 60, y);
        }
    }
}