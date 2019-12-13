package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opgave2 extends Applet {
    Color voegKleur, steenKleur;
    boolean Muur;
    Button openButton;


    public void init() {
        setSize (2000,1200);
        voegKleur = Color.BLACK;
        steenKleur = Color.red;
        openButton= new Button("Open");
        add(openButton);
        openButton.addActionListener (new openButtonListener ());
    }

    public void paint(Graphics g) {
        if (Muur) {
            int x, y = 50, breedte = 120, hoogte = 70;
            for (int a = 0; a < 4; a++) {


                y = 30;
                x = 50;
                for (int kolom = 0; kolom < 15; kolom++) {

                    g.setColor (steenKleur);
                    g.fillRect (x, y, breedte, hoogte);
                    g.setColor (voegKleur);
                    g.drawRect (x, y, breedte, hoogte);
                    x += breedte;

                }

            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;

            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;
            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;
            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;
            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;
            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;
            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;
            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;
            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;
            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;
            }
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 15; kolom++) {
                g.setColor (steenKleur);
                g.fillRect (x, y, breedte, hoogte);
                g.setColor (voegKleur);
                g.drawRect (x, y, breedte, hoogte);
                x += breedte;
            }
        }
    }
    class openButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Muur= true;
            repaint ();

        }
    }
}



