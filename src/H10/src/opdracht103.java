import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht103 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int maand;

    public void init() {
        tekstvak = new TextField("", 2);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener1() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80 );
    }

    class TekstvakListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "januari, die heeft 31 dagen";
                    break;
                case 2:
                    tekst = "februari, die heeft 28 dagen";
                    break;
                case 3:
                    tekst = "maart, die heeft 31 dagen";
                    break;
                case 4:
                    tekst = "april, die heeft 30 dagen";
                    break;
                case 5:
                    tekst = "mei, die heeft 31 dagen";
                    break;
                case 6:
                    tekst = "juni, die heeft 30 dagen";
                    break;
                case 7:
                    tekst = "juli, die heeft 31 dagen";
                    break;
                case 8:
                    tekst = "augustus, die heeft 31 dagen";
                    break;
                case 9:
                    tekst = "september, die heeft 30 dagen";
                    break;
                case 10:
                    tekst = "october, die heeft 31 dagen";
                    break;
                case 11:
                    tekst = "november, die heeft 30 dagen";
                    break;
                case 12:
                    tekst = "december, die heeft 31 dagen";
                    break;
                default:
                    tekst = "ongeldig";
                    break;
            }
            repaint();
        }
    }
}
