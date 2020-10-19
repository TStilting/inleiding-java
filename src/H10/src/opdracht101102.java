import java.awt.*;
import java.applet.*;
import java.awt.event.*;


    public class opdracht101102 extends Applet {

        int hgetal;
        int lgetal;
        int hoogste;
        int laagste;
        TextField tekstvak;
        Label label;
        String tekst1;
        String tekst2;

        public void init() {
            tekstvak = new TextField("", 4);
            tekstvak.addActionListener(new VakListener1());
            tekstvak.addActionListener(new VakListener2());
            tekst1 = "";
            tekst2 = "";
            label = new Label("Enter getal hier");
            hoogste = 0;
            laagste = 9999;
            add(label);
            add(tekstvak);
        }

        public void paint(Graphics g) {
            g.drawString(tekst1, 50, 45);
            g.drawString(tekst2, 50, 55);
        }

        class VakListener1 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s;

                s = tekstvak.getText();
                hgetal = Integer.parseInt(s);
                if (hgetal > hoogste) {
                    hoogste = hgetal;
                    tekst1 = "hoogste getal tot nu toe: " + hoogste;
                    repaint();
                }
            }
        }

                class VakListener2 implements ActionListener {
                    public void actionPerformed(ActionEvent e) {
                        String c;

                        c = tekstvak.getText();
                        lgetal = Integer.parseInt(c);
                        if (lgetal < laagste) {
                            laagste = lgetal;
                            tekst2 = "laagste getal tot nu toe: " + laagste;
                            repaint();
                        }
                    }
                }
    }
