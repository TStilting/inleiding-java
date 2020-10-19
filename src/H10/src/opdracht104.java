import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht104 extends Applet {
    TextField tekstvak1, tekstvak2;
    Label label;
    String c, s, tekst1, tekst2;
    int maand, jaartal, feb;


    public void init() {
        tekstvak1 = new TextField("", 2);
        tekstvak2 = new TextField("", 4);
        label = new Label("Type het maandnummer en jaartal en druk op enter");
        tekstvak1.addActionListener(new TekstvakListener1());
        tekstvak2.addActionListener(new TekstvakListener2());
        tekst1 = "";
        tekst2 = "";
        feb = 28;
        add(label);
        add(tekstvak1);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst1, 50, 80);
        g.drawString(tekst2, 50, 90);
    }

    class TekstvakListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst1 = "januari, die heeft 31 dagen";
                    break;
                case 2:
                    tekst1 = "februari, die heeft " + feb +  " dagen";
                break;
                case 3:
                    tekst1 = "maart, die heeft 31 dagen";
                    break;
                case 4:
                    tekst1 = "april, die heeft 30 dagen";
                    break;
                case 5:
                    tekst1 = "mei, die heeft 31 dagen";
                    break;
                case 6:
                    tekst1 = "juni, die heeft 30 dagen";
                    break;
                case 7:
                    tekst1 = "juli, die heeft 31 dagen";
                    break;
                case 8:
                    tekst1 = "augustus, die heeft 31 dagen";
                    break;
                case 9:
                    tekst1 = "september, die heeft 30 dagen";
                    break;
                case 10:
                    tekst1 = "october, die heeft 31 dagen";
                    break;
                case 11:
                    tekst1 = "november, die heeft 30 dagen";
                    break;
                case 12:
                    tekst1 = "december, die heeft 31 dagen";
                    break;
                default:
                    tekst1 = "ongeldig";
                    break;
            }
            repaint();
        }
    }

    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            c = tekstvak2.getText();
            jaartal = Integer.parseInt(c);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0) {
                tekst2 = "" + jaartal + " is een schrikkeljaar";
                if (maand == 2){
                    feb = 29;
                    tekst1 = "februari, die heeft " + feb +  " dagen";
               }
            } else {
                tekst2 = "" + jaartal + " is geen schrikkeljaar";
                if (maand == 2){
                    feb = 28;
                    tekst1 = "februari, die heeft " + feb +  " dagen";
                }

            }
            repaint();
        }

    }
}
