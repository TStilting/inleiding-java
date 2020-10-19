import java.awt.*;
import java.applet.*;


public class opdracht119 extends Applet {


    public void init() {
    }


    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        int w = 50;
        int h = 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }

        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);

            }
            x += w;
        }

        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }

        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);

            }
            x += w;
        }

        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }

        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);

            }
            x += w;
        }


        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }

        x = 50;
        y += h;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);

            }
            x += w;
        }
        g.drawRect( 50, 50, 400, 400);
    }
}
