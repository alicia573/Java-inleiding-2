
package h10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class Opgave1 extends Applet {
    TextField tekstvak;
    Button okKnop;
    int hoogsteGetal, getal;




    public void init() {
        hoogsteGetal = 0;
        tekstvak = new TextField ("", 30);
        add (tekstvak);
        okKnop = new Button ("Ok");
        okKnop.addActionListener (new KnopListener ());
        add (okKnop);

    }
        public void paint (Graphics g){

                g.drawString ("Hoogste Getal: " + hoogsteGetal, 50, 60);
        }

        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String tekstvakGetal = tekstvak.getText ();
                getal = Integer.parseInt (tekstvakGetal);

                if (getal > hoogsteGetal)  {
                    hoogsteGetal = getal;
                }
                tekstvak.setText ("");
                repaint ();
            }
        }
    }



