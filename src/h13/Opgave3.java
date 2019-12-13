package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opgave3 extends Applet {
    Color voegKleur, steenKleur;
    boolean Muur;
    Button rodeButton, grijzeButton;
    int aantalverticaalstenen, aantalhorizontaalstenen;
    int breedte, hoogte, verticaal, horizontaal;


    public void init() {
        setSize (1100, 1200);
        rodeButton = new Button ("Rodemuur");
        rodeButton.addActionListener (new rodeListener ());
        add (rodeButton);
        Muur = false;
        grijzeButton = new Button ("Grijzemuur");
        add (grijzeButton);
        grijzeButton.addActionListener (new grijzeListener ());
        voegKleur = Color.BLACK;

    }


    public void paint(Graphics g) {
        int x = 50; int y = 50;
        if (Muur) {
            for (verticaal = 0; verticaal < aantalhorizontaalstenen; verticaal++) {
                for (horizontaal = 0; horizontaal < aantalhorizontaalstenen; horizontaal++) {

                    g.setColor (steenKleur);
                    g.fillRect (x, y, breedte, hoogte);
                    g.setColor (voegKleur);
                    g.drawRect (x, y, breedte, hoogte);
                    x += breedte;
                }
                y += hoogte;
                x = 50;

            }
        }
    }
        class rodeListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                breedte = 40;
                hoogte = 35;
                aantalhorizontaalstenen = 25;
                aantalverticaalstenen = 20;
                steenKleur = Color.RED;
                Muur = true;
                repaint ();

            }
        }

        class grijzeListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                breedte = 60;
                hoogte = 50;
                aantalhorizontaalstenen = 15;
                aantalverticaalstenen = 15;
                steenKleur = Color.GRAY;
                Muur = true;
                repaint ();
            }
        }
    }




