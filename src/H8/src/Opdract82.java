import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdract82 extends Applet {
    Button knopM;
    Button knopV;
    Button knopSM;
    Button knopSV;
    int teller1;
    int teller2;
    int teller3;
    int teller4;
    int tellerTotaal;

    public void init() {

        knopM = new Button("Man");
        knopV = new Button("Vrouw");
        knopSM = new Button("Student M");
        knopSV = new Button("Student V");
        knopM.addActionListener( new Opdract82.KnopListenerM() );
        knopV.addActionListener( new Opdract82.KnopListenerV() );
        knopSM.addActionListener( new Opdract82.KnopListenerSM() );
        knopSV.addActionListener( new Opdract82.KnopListenerSV() );
        teller1 = 0;
        teller2 = 0;
        teller3 = 0;
        teller4 = 0;
        tellerTotaal = 0;
        add(knopM);
        add(knopV);
        add(knopSM);
        add(knopSV);
    }
    public void paint(Graphics g) {
        g.drawString (String.valueOf(teller1), 100, 45);
        g.drawString (String.valueOf(teller2), 145, 45);
        g.drawString (String.valueOf(teller3), 210, 45);
        g.drawString (String.valueOf(teller4), 280, 45);
        g.drawString ("Totaal:", 130, 80);
        g.drawString (String.valueOf(tellerTotaal), 170, 80);
    }

    class KnopListenerM implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            teller1++;
            tellerTotaal++;
            repaint();
        }
    }

    class KnopListenerV implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            teller2++;
            tellerTotaal++;
            repaint();
        }
    }

    class KnopListenerSM implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            teller3++;
            tellerTotaal++;
            repaint();
        }
    }

    class KnopListenerSV implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            teller4++;
            tellerTotaal++;
            repaint();
        }
    }
}