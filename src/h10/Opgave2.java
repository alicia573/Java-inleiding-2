
package h10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opgave2 extends Applet {
    TextField tekstvak;
    Button okKnop;
    int hoogsteGetal, laagsteGetal, getal;
    boolean geklikt, fout;
    String error;


    public void init() {
        hoogsteGetal = 0;
        laagsteGetal = 0;
        getal = 0;
        geklikt = false;
        fout = false;
        tekstvak = new TextField("", 30);
        add(tekstvak);
        okKnop = new Button("Ok");
        okKnop.addActionListener(new KnopListener());
        add(okKnop);
    }


    public void paint(Graphics g) {
        if (fout == false) {
            g.drawString("Hoogste Getal: " + hoogsteGetal, 50, 60);
            g.drawString("Laagste Getal: " + laagsteGetal, 50, 80);
        } else {
            g.drawString("" + error, 50, 60);
            fout = false;
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String tekstvakGetal = tekstvak.getText();
                getal = Integer.parseInt(tekstvakGetal);
                if (getal > hoogsteGetal && getal != Integer.MAX_VALUE && getal < Integer.MAX_VALUE) {
                    hoogsteGetal = getal;
                }
                if (getal < laagsteGetal && getal != Integer.MIN_VALUE && getal > Integer.MIN_VALUE) {
                    laagsteGetal = getal;
                }

                if (geklikt == false) {
                    laagsteGetal = hoogsteGetal;
                }
                tekstvak.setText("");
                geklikt= true;
                fout = false;
                repaint();

            }
            catch (NumberFormatException exc) {
                fout = true;
                error = "Verkeerde Nummer";
                tekstvak.setText("");
                repaint();
            }

        }
    }
}












































