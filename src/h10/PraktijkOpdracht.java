package h10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class PraktijkOpdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfers;


    public void init() {
        tekstvak = new TextField ("", 20);
        label = new Label ("Type een cijfer in : ");
        tekstvak.addActionListener (new TekstvakListener ());
        tekst = "";
        add (label);
        add (tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfers = Integer.parseInt( s);

                if (cijfers<=10) {

                    if (cijfers <= 3) {
                        tekst = "Slecht";

                        repaint ();}
                    if (cijfers == 4) {
                        tekst = "Onvoldoende";

                        repaint ();
                    } if (cijfers == 5) {
                        tekst = "Matig";

                        repaint ();
                    }if (cijfers == 6 || cijfers == 7) {
                        tekst = "Voldoende";
                        repaint ();
                    }if (cijfers >= 8 && cijfers <= 10) {
                        tekst = "Goed";

                        repaint ();
                    }
                }
                else {

                        tekst = "Verkeerd cijfer";
                        repaint ();
                }
        }
    }
}

